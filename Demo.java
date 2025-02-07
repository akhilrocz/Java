//  class Calculator{
//     int x;
//     public int calculates(int a,int b){
//         int c = a+b;
//         return c;
//     }
// }

// public class Demo {
//     public static void main(String[] args){
//         int m=3;
//         int n=5;
//         Calculator cal = new Calculator();
//        int res = cal.calculates(m,n);
//        System.out.print(res);

//     }
// }

//Encapsulation
 class Human{
   private String name;
    private int age;
    public String getName()
    {
        return name;
    }
    public void setAge(int x){
        age = x;
    }
    public int getAge(){
        return age;
    }
    public void setName(String s){
        name = s;

    }
 }


public class Demo{
    public static void main(String[] args){
        Human human = new Human();
       human.setAge(30);
       human.setName("Akhil");
        System.out.println(human.getName());
        System.out.println(human.getAge());

    }
}

