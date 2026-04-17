package part5.part5_1;

import java.util.ArrayList;
import java.util.List;

public class Lion extends Predator implements Trainable {
    private List<String> commands = new ArrayList<>();

    public Lion(String name, int age, double weight, int energyLevel) {
        super(name, age, weight, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Р-р-р!");
    }

    public void roar() {
        System.out.println(name + " громко рычит: РРРРРР!");
    }

    @Override
    public void train(String command) {
        commands.add(command);
        System.out.println(name + " выучил команду: " + command);
    }

    @Override
    public List<String> listCommands() {
        return new ArrayList<>(commands); // возвращаем копию для защиты данных
    }
}