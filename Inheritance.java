
class Animal {
    String nameofAnimal = "Rocky";

    void sleep() {
        System.out.println("Animal Sleeps");
    }

    void name() {
        System.out.println("name");
    }
}

class Dog extends Animal {

    void sleep() {
        super.sleep();
    }

    void name() {
        System.out.println(super.nameofAnimal);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sleep();
        dog.name();
    }
}
