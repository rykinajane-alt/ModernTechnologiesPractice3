package part1.part1_1;

import java.time.LocalDate;

public class NumberClassifier {

    /**
     * Классифицирует число по диапазонам.
     * Подсказка 1: интервалы должны быть непересекающимися.
     * Подсказка 2: проверяйте от самых специфичных граничных случаев.
     */
    public static String classify(int number) {
        // TODO: верните категорию для number по условию задания.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (number < 0) {
            return "отрицательное";
        } else if (number == 0) {
            return "ноль";
        } else if (number < 10) {
            return "однозначное";
        } else if (number < 100) {
            return "двузначное";
        } else if (number < 1000) {
            return "трёхзначное";
        } else {
            return "большое";
        }
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        System.out.println("Group: ПИ4-2в");
        System.out.println("Sequence number: 12");
        System.out.println("Date: " + LocalDate.now());
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲

        int[] samples = {-5, 0, 7, 42, 100, 1000, -999};
        for (int n : samples) {
            System.out.println(n + " -> " + classify(n));
        }
        // Проверь себя: 0 -> ноль, 7 -> однозначное, 1000 -> большое
        // Типичные ошибки: пропущены края 9/10/99/100/999/1000.
    }
}