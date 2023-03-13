public class Chicken extends Animal implements Runable, Flyable{

    public Chicken(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedOfFly() {
        return 1;
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public String say() {
        return "кудахтает";
    }
}