class Dog {
    String name;
    String breed;
    int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark() {
        System.out.print("Woof");
    }
}

class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden retreiver", 5);
        System.out.println(dog.name);
        System.out.println(dog.breed);
        System.out.println(dog.age);
        dog.bark();
    }
}