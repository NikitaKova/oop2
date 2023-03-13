public class Stork extends Animal implements Runable, Flyable, Wild{

    public Stork(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedOfFly() {
        return 21;
    }

    @Override
    public int speedOfRun() {
        return 7;
    }

    @Override
    public String wild() {
        return "Дикий";
    }

    @Override
    public String say() {
        return "что то на аистком";
    }
}