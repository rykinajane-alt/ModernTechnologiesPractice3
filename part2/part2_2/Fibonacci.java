package part2.part2_2;

public class Fibonacci {

    public static long fibIterative(int n) {
        // TODO: реализуйте while-вариант.
        // Подсказка: базовые случаи n=0 и n=1 обработайте отдельно.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long prev = 0;  // F(0)
        long curr = 1;  // F(1)
        int count = 1;

        while (count < n) {
            long next = prev + curr;
            prev = curr;
            curr = next;
            count++;
        }
        return curr;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static long fibFor(int n) {
        // TODO: реализуйте for-вариант.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (n <= 0) return 0;
        if (n == 1) return 1;

        long prev = 0;  // F(0)
        long curr = 1;  // F(1)

        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static long firstGreaterThan(long threshold) {
        // TODO: найдите первое число Фибоначчи > threshold.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (threshold < 0) return 0;

        long prev = 0;  // F(0)
        long curr = 1;  // F(1)

        while (curr <= threshold) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++) {
            System.out.printf("F(%d)=%d | %d%n", i, fibIterative(i), fibFor(i));
        }
        System.out.println("Первое число Фибоначчи > 1000: " + firstGreaterThan(1000));
        // Проверь себя: обе реализации fib дают одинаковые значения.
    }
}