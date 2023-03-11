public class Dog extends Animal {
    public String name;
    public String friendship;

    public Dog(String name, String friendship){
        this.name = name;
        this.friendship = friendship;
        this.pet = "dog";
        this.food = "meat";
        this.location = "yard";
    }

    public void makeNoise() {
        System.out.println("A dog named " + name + " said woof" );
    }
    public void eat() {
        System.out.println("A dog named " + name + " is eating " + food);
    }
    public void sleep() {
        System.out.println("A dog named " + name + " is sleeping in the " + location);
    }
    public void displayFriendship(){
        System.out.println("A dog named " + name + " is " + friendship);
    }
}