package part3.part3_2;

public class BankAccountDemo {
    private static String bankName;

    static {
        // TODO: bankName = "Java Bank"; выведите "Банковская система инициализирована"
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        bankName = "Java Bank";
        System.out.println("Банковская система инициализирована");
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        System.out.println("Банк: " + bankName);
        BankAccount acc = new BankAccount("RU-123", "Ivan Petrov", "1234", 120_000);
        System.out.println(acc);

        System.out.println("Снятие (неверный PIN): " + acc.withdraw("1111", 1000));
        System.out.println("Состояние после 1-й неудачной попытки:");
        System.out.println(acc);

        System.out.println("Снятие (неверный PIN): " + acc.withdraw("1111", 1000));
        System.out.println("Состояние после 2-й неудачной попытки:");
        System.out.println(acc);

        System.out.println("Снятие (неверный PIN): " + acc.withdraw("1111", 1000));
        System.out.println("Состояние после 3-й неудачной попытки (блокировка):");
        System.out.println(acc);

        System.out.println("Снятие (верный PIN, но счёт заблокирован): " + acc.withdraw("1234", 1000));
        System.out.println(acc);

        // Создаём новый счёт для демонстрации успешного снятия
        System.out.println("\n=== Демонстрация успешной операции ===");
        BankAccount acc2 = new BankAccount("RU-456", "Petr Ivanov", "5678", 50_000);
        System.out.println(acc2);
        System.out.println("Снятие (верный PIN, сумма 3000): " + acc2.withdraw("5678", 3000));
        System.out.println(acc2);

        System.out.println("Пополнение (10000): " + acc2.deposit(10000));
        System.out.println(acc2);
        System.out.println("Пополнение (-500): " + acc2.deposit(-500));
        System.out.println(acc2);

        // Проверь себя: после 3 неверных попыток счет блокируется.
    }
}