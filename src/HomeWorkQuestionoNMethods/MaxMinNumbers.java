// Question = Define two methods to print themaximum and the minimum number
// respectively among threenumbers enteed by user.

package HomeWorkQuestionoNMethods;
import java.util.Scanner;
public class MaxMinNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        int maximum = findMaximum(num1, num2, num3);  // Static method driecly call with method name
       // int minimum = find.findMaximum(num1, num2, num3);
        int minimum = find.findMinimum(num1, num2, num3);  // in static method call non staic method from anoter
        System.out.println("Maximum number: " + maximum);  // method use class name as reference.
        System.out.println("Minimum number: " + minimum);
    }
    public static int  findMaximum(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
//   public static int findMinimum(int num1, int num2, int num3) {
//       int min = num1;
//       if (num2 < min)
//       {
//           min = num2;
//       }
//       if (num3 < min) {
//           min = num3;
//       }
//
//       return min;}

}

class find {
    public static int findMinimum(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        return min;
    }
}