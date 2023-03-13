public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Cat", 1, "White"))
                .addAnimal(new Dog("Dog", 2))
                .addAnimal(new Tiger("Tiger", 3, null))
                .addAnimal(new Stork("Аист", 4))
                .addAnimal(new Wolf("Wolf", 20)
                );

        for (Animal animal : zoo.getAnimals()){
            System.out.println(animal);
            System.out.println(animal.say());
        }

        System.out.println("__________________________Speakable");

        for (Speakable speak : zoo.getSpeakables()){
            System.out.println(speak.say());
        }

        System.out.println("__________________________Runable");

        for (Runable runner : zoo.getRunables()){
            System.out.println(String.format("%s, скорость: %s", String.valueOf(runner), runner.speedOfRun()));
        }

        System.out.println("__________________________Flyable");

        for (Flyable fly : zoo.getFlyable()){
            System.out.println(String.format("%s, скорость: %s", String.valueOf(fly), fly.speedOfFly()));
        }

    }
}