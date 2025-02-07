//Compile Time Polymorphism

class Add
{
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
}
//Compile Time polymorphism
public class CompileTimePoly {
    public static void main(String[] args){
        System.out.println(Add.add(2,4));
        System.out.println(Add.add(1,2,9));
    }
}
