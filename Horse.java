public class Horse extends Animal {
    public String name;
    public String color;
    public Horse(String name, String color){
        this.name = name;
        this.color = color;
        this.pet = "horse";
        this.food = "wheat";
        this.location = "stable";

    }

    public void makeNoise() {
        System.out.println("A horse named " + name + " said ihaa");
    }
    public void eat() {
        System.out.println("A horse named " + name + " is eating " + food);
    }
    public void sleep() {
        System.out.println("A horse named " + name + " is sleeping in the " + location);
    }
    public void displayColor(){
        System.out.println("A horse named " + name + " is " + color);
    }
}