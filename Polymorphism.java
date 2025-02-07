
class Addition {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }
}

class Animal {
    String name = "Jocky";

    void barks() {
        System.out.println("Animal barks");
    }

    void displayName() {
        System.out.println("Name of Animal" + name);
    }
}

class Cat extends Animal {
    void barks() {
        super.barks();
    }

    void displayName() {
        System.out.println(super.name);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(2, 3));
        System.out.println(addition.add(3.5, 2.5, 1.2));
        Animal animal = new Cat();
        animal.barks();
        animal.displayName();
    }
}
