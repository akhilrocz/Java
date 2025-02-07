
public class Method_overloading {

    private int add(int a, int b) {
        return a + b;
    }

    private int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Method_overloading overloading = new Method_overloading();
        System.out.println(overloading.add(1, 2));
        System.out.println(overloading.add(1, 3, 5));
    }
}
