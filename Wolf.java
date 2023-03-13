public class Wolf extends Animal implements Runable{

    public Wolf(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedOfRun() {
        return 30;
    }

    @Override
    public String say() {
        return "Воет";
    }
}