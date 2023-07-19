package CoreJava;

import java.util.Scanner;

public class Calculator
{
//    Main class
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please Enter The 1St Number : ");
        System.out.println("========================================================================");
        int Fno = scanner.nextInt();

        System.out.println("please Enter The 2nd Number : ");
        System.out.println("========================================================================");
        int Sno = scanner.nextInt();
        System.out.println(" Please Select Your Choice \n1-->Addition \n2-->Substraction \n3-->Multipcation \n4-->Division");
        System.out.println("========================================================================");
        int ch = scanner.nextInt();

        switch (ch)
        {
            case 1:
                int addd = Addition.Additionss(Fno,Sno);
                break;

            case 2:
               int  Subb = new Substraction().Subst(Fno,Sno);


                break;


            case 3:
                int mul = multipcation.mult( Fno, Sno);

                break;

            case 4:
                int Divs = Division.Divs(Fno,Sno);
                break;


        }
        System.out.println("!!Thank You!!");
        System.out.println("========================================================================");
    }
}

  class Addition {
//    Business class 1
      public static int Additionss(int Fno, int Sno) {
          int Add = Fno + Sno;
          System.out.println("Addition is :"+Add);
          return Add;
      }
}
class Substraction
//    Business class 2
{ 
    public int Subst (int Fno,int Sno)
    {
        int Add = Fno-Sno;
        System.out.println("Subtraction is :" +Add);
        return Add;
    }
}
class multipcation
//    Business class 3
{
    public static int  mult(int Fno, int Sno)
    {
        int muls = Fno*Sno;
        System.out.println("Multiplication is : "+muls);
        return muls;
    }
}
class Division
{
//    Business class 4
    public static int Divs(int Fno, int Sno)
    {
        int Add = Fno/Sno;
        System.out.println("Division is : "+Add);
        return Add;
    }
}





