package CoreJava;

import java.util.Scanner;

public class MainApp6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Current Reading : ");
        double cr = sc.nextInt();
        System.out.println("Enter Pervious Reading : ");

        double pr = sc.nextInt();

        System.out.println("Select Bill Type ");
        System.out.println("1---> Residential \n2--> Commercial");
        int ch = sc.nextInt();

        switch (ch)
        {
            case  1:
                double amt = BillCalculator.residentialBill(cr,pr);
                System.out.println("Res Bill amt"+amt);
                break;

            case 2:
                 amt =  new BillCalculator().commercialBill(cr,pr);  // new key word will stroes non-stasic method into heap area.
                System.out.println("Res Bill amt"+amt);
                break;
            default:
                System.out.println("Invalid Choice");

        }


    }
}

class BillCalculator {
    public static double residentialBill(double cr, double pr) {    // static method
        double unit = cr - pr;
        if (unit > 0)
            return unit * 7;
        else
            return 0;


    }

    public double commercialBill(double cr, double pr) {     // non-static method
        double unit = cr - pr;

        if (unit > 0)
        {
            return unit*12;

        }
        else
            return 0;
    }

}