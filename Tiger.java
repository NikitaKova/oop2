public class Tiger extends Animal implements Runable, Wild{

    private String color;

    public Tiger(String name, int box, String color) {
        super(name, box);
        this.color = color;
    }

    @Override
    public int speedOfRun() {
        return 50;
    }

    @Override
    public String wild() {
        return "Дикий";
    }

    @Override
    public String say() {
        return "РРРР";
    }

    @Override
    public String toString() {
        return String.format("Tiger: %s, colour: %s", super.toString(), this.color);
    }
}