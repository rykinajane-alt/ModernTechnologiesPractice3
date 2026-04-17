package part1.part1_2;

public class GradeChecker {

    public static String getGradeClassic(int score) {
        // TODO: реализуйте вариант через классический switch.
        // Подсказка: удобно сначала вычислить "десяток" score / 10.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int tens = score / 10;

        switch (tens) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                if (score < 0 || score > 100) {
                    return "недопустимая оценка";
                }
                return "F";
        }
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static String getGradeArrow(int score) {
        // TODO: реализуйте вариант через switch -> (Java 14+).
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int tens = score / 10;

        return switch (tens) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> {
                if (score < 0 || score > 100) {
                    yield "недопустимая оценка";
                }
                yield "F";
            }
        };
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        int[] samples = {95, 85, 73, 62, 45, 100, 0};
        for (int score : samples) {
            System.out.printf("%d -> classic: %s | arrow: %s%n",
                    score, getGradeClassic(score), getGradeArrow(score));
        }
        // Проверь себя: для одного score оба метода дают одинаковую оценку.
    }
}