package part5.part5_1;

public abstract class Animal {
    protected String name;
    protected int age;
    protected double weight;
    protected int energyLevel;

    protected Animal(String name, int age, double weight, int energyLevel) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.energyLevel = Math.min(energyLevel, 100); // гарантируем, что энергия не выше 100
    }

    public void eat(int calories) {
        // TODO: увеличьте energyLevel, но не выше 100.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int increase = calories / 50; // например, каждые 50 калорий дают +1 энергии
        energyLevel = Math.min(100, energyLevel + increase);
        System.out.println(name + " поел(а) на " + calories + " калорий. Энергия: " + energyLevel);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public void sleep(int hours) {
        // TODO: увеличьте energyLevel в зависимости от часов, но не выше 100.
        // ▼ ВАШ КОД ЗДЕСЬ ▼
        int increase = hours * 10; // 10 энергии за час сна
        energyLevel = Math.min(100, energyLevel + increase);
        System.out.println(name + " поспал(а) " + hours + " часов. Энергия: " + energyLevel);
        // ▲ КОНЕЦ ВАШЕГО КОДА ▲
    }

    public abstract void makeSound();

    public int getEnergyLevel() {
        return energyLevel;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }
}