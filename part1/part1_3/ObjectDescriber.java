package part1.part1_3;

public class ObjectDescriber {

    public static String describe(Object obj) {
        // TODO: используйте switch с pattern matching (Java 17+ preview).
        // Подсказка 1: обработайте null отдельным case.
        // Подсказка 2: для Integer укажите "положительное" или "не положительное".
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        return switch (obj) {
            case null -> "null reference";
            case Integer i -> i > 0 ? "положительное целое" : "не положительное целое";
            case String s -> s.isEmpty() ? "пустая строка" : "непустая строка (длина " + s.length() + ")";
            case Double d -> "вещественное число: " + d;
            case int[] arr -> "массив из " + arr.length + " элементов";
            case Boolean b -> b ? "логическое: true" : "логическое: false";
            default -> "другой объект: " + obj.getClass().getSimpleName();
        };
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        Object[] samples = {null, 42, -5, "", "Привет", 3.14, new int[]{1, 2, 3}, true};
        for (Object sample : samples) {
            System.out.println(describe(sample));
        }
        // Проверь себя: пустая строка и непустая строка должны различаться.
        // Типичные ошибки: забывают обработать default.
    }
}