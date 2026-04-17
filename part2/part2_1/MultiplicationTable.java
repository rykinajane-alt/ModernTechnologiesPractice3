package part2.part2_1;

public class MultiplicationTable {

    public static void printTable() {
        // TODO: выведите таблицу умножения 1..10, ширина столбца 4.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        printTable();
        // Проверь себя: каждая строка начинается с номера строки.
    }
}