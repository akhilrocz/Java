
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person("Akhil", 21);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        person.setAge(25);
        person.setName("Nikhil");
    }
}