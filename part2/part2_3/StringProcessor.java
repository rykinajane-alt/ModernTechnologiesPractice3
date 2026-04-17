package part2.part2_3;

public class StringProcessor {
    private static final String VOWELS = "aeiouyаеёиоуыэюя";

    public static int countVowels(String text) {
        // TODO: посчитайте русские и английские гласные.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int count = 0;
        String lowerText = text.toLowerCase();

        for (int i = 0; i < lowerText.length(); i++) {
            char c = lowerText.charAt(i);
            if (VOWELS.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static boolean isPalindrome(String text) {
        // TODO: палиндром без учета регистра и знаков препинания.
        // Подсказка: сравнение символов с двух концов.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (text == null || text.isEmpty()) {
            return true;
        }

        // Очищаем строку: оставляем только буквы и цифры, приводим к нижнему регистру
        String cleaned = text.toLowerCase().replaceAll("[^a-zа-яё0-9]", "");

        // Сравниваем символы с двух концов
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static String reverse(String text) {
        // TODO: реверс без StringBuilder.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (text == null || text.isEmpty()) {
            return text;
        }

        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Меняем местами символы
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static String findLongestWord(String sentence) {
        // TODO: найдите самое длинное слово.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        // Разбиваем на слова, удаляя знаки препинания
        String[] words = sentence.split("[\\s\\p{Punct}]+");

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public static void main(String[] args) {
        String s1 = "Привет, Java-разработчик!";
        String s2 = "топот";
        String s3 = "Madam";
        String s4 = "hello";
        String s5 = "А роза упала на лапу Азора";
        String s6 = "The quick brown fox jumps over the lazy dog";

        System.out.println("Гласные: " + countVowels(s1));
        System.out.println("Палиндром (топот): " + isPalindrome(s2));
        System.out.println("Палиндром (Madam): " + isPalindrome(s3));
        System.out.println("Реверс (hello): " + reverse(s4));
        System.out.println("Палиндром (фраза): " + isPalindrome(s5));
        System.out.println("Самое длинное слово: " + findLongestWord(s6));
    }
}