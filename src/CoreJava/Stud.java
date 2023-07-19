
 package CoreJava;
import java.util.Scanner;
public class Stud
{
     class Student
    {
        int sRollNo;
        String sName;
        Double sMark;

        public void display()
        {
            System.out.println("ROLLNO: " + sRollNo);
            System.out.println("NAME: " + sName);
            System.out.println("MARKS: " + sMark);
        }
    }

    public class MainApp8
    {
        static Scanner sc = new Scanner(System.in);

        public static void main(String[] args)
        {
            Student s1 = getStudent();
            Student s2 = getStudent();
            Student s3 = getStudent();
            Student s4 = getStudent();

            double totalMarks = s1.sMark + s2.sMark + s3.sMark + s4.sMark;
            int count = 4;
            double averageMarks = totalMarks / count;
            double maxMarks = 100;
            double percentage = (totalMarks / (maxMarks * count)) * 100;

            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Marks: " + averageMarks);
            System.out.println("Percentage: " + percentage + "%");
        }

        public static Student getStudent()
        {
            System.out.println("-------------");
            Student stu = new Student();

            System.out.println("Enter roll number:");
            stu.sRollNo = sc.nextInt();

            System.out.println("Enter student name:");
            sc.nextLine();
            stu.sName = sc.next();

            System.out.println("Enter student marks:");
            stu.sMark = sc.nextDouble();

            return stu;
        }
    }
}
