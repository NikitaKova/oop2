public class Dog extends Animal implements Runable, HomeAnimal{

    public Dog(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedOfRun() {
        return 20;
    }
    
    @Override
    public String home() {
        return "Домашний";
    }

    @Override
    public String say() {
        return "Гав";
    }
}