class Mobile{
    String brand;
    int price;
   static String name;
   public void show(){
       System.out.println(brand + " " + price + " " + name);
   }

   public static void show1(Mobile mob1){
    System.out.println(mob1.brand + " " + mob1.price + " " + name);   //instance variable cannot be used in static method
   }                                                        //static variable can be used in static method
}

public class Static_method {
   /**
 * @param args
 */
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
       Mobile.show1(mob1);

   }
}
