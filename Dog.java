
public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " says woof!");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.bark();
    }
}
