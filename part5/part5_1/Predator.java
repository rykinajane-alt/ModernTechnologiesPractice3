package part5.part5_1;

public abstract class Predator extends Animal {
    protected Predator(String name, int age, double weight, int energyLevel) {
        super(name, age, weight, energyLevel);
    }

    public void hunt() {
        // TODO: +30 к energyLevel (макс 100), weight -= 0.5.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        energyLevel = Math.min(100, energyLevel + 30);
        weight -= 0.5;
        System.out.println(name + " охотился(ась)! Энергия: " + energyLevel + ", вес: " + weight);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }
}