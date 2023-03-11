public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Neko", "lazy");
        Dog dog1 = new Dog("Pes", "friendly");
        Horse horse1 = new Horse("Lis", "black-white");
        Vet vet = new Vet();
        vet.treatAnimal(cat1);
        vet.treatAnimal(dog1);
        vet.treatAnimal(horse1);
        cat1.eat();
        cat1.makeNoise();
        cat1.sleep();
        cat1.displayActivity();

        dog1.eat();
        dog1.makeNoise();
        dog1.sleep();
        dog1.displayFriendship();

        horse1.eat();
        horse1.makeNoise();
        horse1.sleep();
        horse1.displayColor();
    }
}