public class Wolf extends Animal implements Runable, Wild{

    public Wolf(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedOfRun() {
        return 30;
    }

    @Override
    public String wild() {
        return "Дикий";
    }

    @Override
    public String say() {
        return "Воет";
    }
}