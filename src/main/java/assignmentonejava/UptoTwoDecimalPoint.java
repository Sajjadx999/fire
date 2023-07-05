package assignmentonejava;

import java.text.DecimalFormat;

 //Suppose a=15.5276. print the value upto 2 decimal point.

public class UptoTwoDecimalPoint {

    public static void main(String[] args) {

        double a =15.5273;
        DecimalFormat df= new DecimalFormat("0.00");
        System.out.println("Value upto 2 decimal points: "+ df.format(a));

    }
}

