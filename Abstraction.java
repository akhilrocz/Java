abstract class Animal {

  abstract void sound();

  void sleep() {
    System.out.println("Animal sleeps");
  }
}

class Dog extends Animal {
  void sound() {
    System.out.println("bark");
  }
}

public class Abstraction {
  public static void main(String[] args) {
    Animal dog = new Dog();
    dog.sound();
    dog.sleep();
  }
}
