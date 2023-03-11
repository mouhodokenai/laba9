public class Cat extends Animal {
    public String name;
    public String activity;

    public Cat(String name, String activity){
        this.name = name;
        this.activity = activity;
        this.pet = "cat";
        this.food = "fish";
        this.location = "house";
    }

    public void makeNoise() {
        System.out.println("A cat named " + name + " said meow");
    }
    public void eat() {
        System.out.println("A cat named " + name + " is eating " + food);
    }
    public void sleep() {
        System.out.println("A cat named " + name + " is sleeping in the " + location);
    }
    public void displayActivity() {
        System.out.println("A cat named " + name + " is " + activity);
    }
}
