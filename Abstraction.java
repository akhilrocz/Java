
abstract class Animal {

  public abstract void makeSound();

  public void sound() {
    System.out.println("wee");
  }
}

class Pig extends Animal {

  public void makeSound() {
    System.out.println("Pig says hello");
  }
}

public class Abstraction {

  public static void main(String[] args) {
    Pig pig = new Pig();
    pig.makeSound();
    pig.sound();
  }
}