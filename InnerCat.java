
class Cat {
    public void sound() {
        System.out.println("Cat makes sound.");
    }

}

class CatSon extends Cat {

    public void sound() {
        System.out.println("Cat son makes sound");
    }

}

class GrandSon extends Cat {

    public void sound() {
        System.out.println("Grandson makes sound.");
    }

}

public class InnerCat {

    public static void main(String[] args) {
        Cat cat1 = new CatSon();
        cat1.sound();

        Cat cat2 = new GrandSon();

        cat2.sound();
    }
}
