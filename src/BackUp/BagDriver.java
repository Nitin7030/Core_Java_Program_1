package BackUp;

import java.util.Scanner;

public class BagDriver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bag B1 = new Bag();
        System.out.println(B1.getColor());
        System.out.println(B1.getPrice());
        System.out.println("-------------------------");

        System.out.println("Enter the color");
        String a =sc.next();
        System.out.println("------------");
        System.out.println("Enter the price");
        double b =sc.nextDouble();
        B1.getColor();
        B1.getPrice();
        System.out.println("--------------------");

        System.out.println(B1.getPrice());
//		  System.out.println(B1.getcolor());





    }
}
