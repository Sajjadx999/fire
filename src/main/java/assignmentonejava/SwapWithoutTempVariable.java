package assignmentonejava;

//  Suppose, a=10 and b=20. Now swap the value without a temp variable.

public class SwapWithoutTempVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);

    }
}
