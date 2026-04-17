package part4.part4_1;

public class DiscountCalculator {

    // Перегрузка 1: Скидка по типу клиента
    public static double calculateDiscount(double price, String customerType) {
        if (price <= 0) return 0.0;

        double discountPercent = 0.0;
        switch (customerType.toLowerCase()) {
            case "vip":
                discountPercent = 0.20;
                break;
            case "regular":
                discountPercent = 0.05;
                break;
            case "new":
                discountPercent = 0.03;
                break;
        }
        return price * discountPercent;
    }

    // Перегрузка 2: Скидка по количеству покупок
    public static double calculateDiscount(double price, int purchaseCount) {
        if (price <= 0 || purchaseCount < 0) return 0.0;

        double discountPercent = 0.0;
        if (purchaseCount >= 100) discountPercent = 0.15;
        else if (purchaseCount >= 50) discountPercent = 0.10;
        else if (purchaseCount >= 20) discountPercent = 0.07;
        else if (purchaseCount >= 10) discountPercent = 0.05;
        else if (purchaseCount >= 5) discountPercent = 0.02;

        return price * discountPercent;
    }

    // Перегрузка 3: Скидка по промокоду + бонус за первый заказ
    public static double calculateDiscount(double price, String promoCode, boolean isFirstOrder) {
        if (price <= 0 || promoCode == null) return 0.0;

        double discountPercent = 0.0;
        switch (promoCode.toUpperCase()) {
            case "SAVE20":
                discountPercent = 0.20;
                break;
            case "SAVE10":
                discountPercent = 0.10;
                break;
            case "WELCOME5":
                discountPercent = 0.05;
                break;
        }

        if (isFirstOrder) discountPercent += 0.05;
        discountPercent = Math.min(discountPercent, 0.30);

        return price * discountPercent;
    }

    // Перегрузка 4: Скидка по возрасту и сезону
    public static double calculateDiscount(double price, int age, String season) {
        if (price <= 0 || age < 0 || season == null) return 0.0;

        double discountPercent = 0.0;

        // Скидка по возрасту
        if (age >= 65) discountPercent += 0.15;
        else if (age <= 18 && age >= 6) discountPercent += 0.10;
        else if (age >= 55) discountPercent += 0.08;

        // Сезонная скидка
        switch (season.toLowerCase()) {
            case "winter": discountPercent += 0.10; break;
            case "summer": discountPercent += 0.08; break;
            case "spring": case "autumn": discountPercent += 0.05; break;
        }

        // Ограничиваем максимальную скидку 50%
        discountPercent = Math.min(discountPercent, 0.50);

        return price * discountPercent;
    }

    // Оригинальный main метод (не изменялся)
    public static void main(String[] args) {
        double price = 10000.0;
        System.out.println("VIP: " + calculateDiscount(price, "vip"));
        System.out.println("75 покупок: " + calculateDiscount(price, 75));
        System.out.println("SAVE20 + first: " + calculateDiscount(price, "SAVE20", true));
        System.out.println("Возраст+сезон: " + calculateDiscount(price, 65, "winter"));
    }
}