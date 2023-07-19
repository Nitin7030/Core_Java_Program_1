// Define aprogram to find out whether give nnumber is even or odd.
package HomeWorkQuestionoNMethods;
import java.util.Scanner;
public class EvenOrOdd
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int EvenNO = Even.EvenNumber(num1,num2);
        int OddNo = Odd.OddNumber(num1,num2);
    }
}
class Even
{
public static int  EvenNumber (int num1,int num2)
        {
            if (num1>num2)
                System.out.println("num1 is Maxinium :"+num1);
                System.out.println("");

            return num1;
        }
}
class Odd {
    public static int OddNumber(int num1, int num2) {
        if (num1 < num2)
            System.out.println("Num 2 is Maximun : "+num2);
        return num2;
    }
}