package part5.part5_1;

public abstract class Herbivore extends Animal {
    protected Herbivore(String name, int age, double weight, int energyLevel) {
        super(name, age, weight, energyLevel);
    }

    public void graze() {
        // TODO: +15 к energyLevel (макс 100).
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        energyLevel = Math.min(100, energyLevel + 15);
        System.out.println(name + " пасётся на лугу. Энергия: " + energyLevel);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }
}