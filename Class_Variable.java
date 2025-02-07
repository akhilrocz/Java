class Mobile{
     String brand;
     int price;
    static String name;
    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }

}

public class Class_Variable {
    public static void main(String[] args){
        Mobile mob1 = new Mobile();
        mob1.brand="Samsung";
        mob1.price=25000;
        Mobile.name="SmartPhone";
        
        Mobile mob2 = new Mobile();
        mob2.brand="Apple";
        mob2.price=100000;
        Mobile.name="SmartPhone";

        Mobile.name="Phone";
        mob1.show();
        mob2.show();

    }
}
