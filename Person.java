class Person {
    private String name;
    private int age;

    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    //copy constructor
    public Person(Person other){
        this.name=other.name;
        this.age=other.age;

    }
    public void display(){
        System.out.println(name + "" + age);
    }
    public static void main(String[] args) {
        Person person = new Person("akhil",30);
        Person copy = new Person(person);
        person.display();
       
        copy.display();
    }

}
