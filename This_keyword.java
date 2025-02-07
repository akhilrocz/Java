class Getters_Setters {
    private String name;
    private int age;
   public String getName() {
       return name;
   }
   public int getAge() {
       return age;
   }
   public void setName(String name) {
       this.name = name;  //if name=name 
   }
   public void setAge(int age) {

       this.age = age;   //refers to current object
   }
   
   
   }
   
   public class This_keyword{
       public static void main(String[] args){
           Getters_Setters setget = new Getters_Setters();
           setget.getAge();
           setget.getName();
           setget.setAge(30);
           setget.setName("Akhil");
           System.out.println(setget.getAge());
           System.out.println(setget.getName());
       }
   }
   