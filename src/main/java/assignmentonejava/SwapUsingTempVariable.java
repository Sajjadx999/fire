package assignmentonejava;

//  Suppose, a=10 and b=20. Now swap the value using a temp variable.

public class SwapUsingTempVariable {

    public static void main(String[] args) {

        int a =10;
        int b =20;

        System.out.println("Before swap: a "+a+" b "+b);

        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("After swap: a "+a+" b "+b);

    }
}
