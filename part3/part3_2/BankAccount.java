package part3.part3_2;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private final String owner;
    private int failedAttempts;
    private boolean blocked;
    private String pin;

    public BankAccount(String accountNumber, String owner, String pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.pin = pin;
        this.balance = initialBalance;
        this.failedAttempts = 0;
        this.blocked = false;
    }

    public boolean validatePin(String enteredPin) {
        return pin != null && pin.equals(enteredPin);
    }

    public boolean deposit(double amount) {
        // TODO: пополнение разрешено только при amount > 0.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public boolean withdraw(String enteredPin, double amount) {
        // TODO: реализуйте логику блокировки и попыток:
        // 1) если blocked -> отказ;
        // 2) неверный PIN увеличивает failedAttempts;
        // 3) при 3 неверных попытках blocked=true;
        // 4) верный PIN сбрасывает failedAttempts и проверяет amount.
        // ▼ ВАШ КОД ЗДЕСЬ ▼

        // 1) Если счёт заблокирован - отказ
        if (blocked) {
            return false;
        }

        // 2) Проверка PIN
        if (!validatePin(enteredPin)) {
            failedAttempts++;
            // 3) При 3 неверных попытках блокируем счёт
            if (failedAttempts >= 3) {
                blocked = true;
            }
            return false;
        }

        // 4) PIN верный - сбрасываем счётчик неудачных попыток
        failedAttempts = 0;

        // Проверяем сумму и наличие средств
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }

        return false;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public String getMaskedBalance() {
        // TODO: скрывайте суммы свыше 100000.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (balance > 100_000) {
            return "*****";
        }
        return String.format("%.2f", balance);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    @Override
    public String toString() {
        return String.format("BankAccount{%s, owner=%s, balance=%s}%s",
                accountNumber, owner, getMaskedBalance(), blocked ? " [ЗАБЛОКИРОВАН]" : "");
    }
}