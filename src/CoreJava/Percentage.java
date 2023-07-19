package CoreJava;

import java.util.Scanner;

public class Percentage
{
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Attended Lec :");
        int Alec = scanner.nextInt();
        System.out.println("-------------------------");
        System.out.println("Enter Total Lec :");
        int Tlec = scanner.nextInt();
        System.out.println("-------------");

        int per = Tlec*Alec/100;
        System.out.println("Total attendance is "+per);
        System.out.println("----------------------");

        if (per<=75)
            System.out.println(" Sorry !!,You are not elegible for exam");
        else
            System.out.println(" Congratulations!!, You are elegible Exam");

 }
}
