package BackUp;
import java.util.Scanner;
class Laptop               // Class For Intilization of Non-Static menbers.
                          // Non-Static Members Use Because of  There is data type is not avilable who declare all
{
    String companyName;
    double price;
    String color;
    int ram;
    public void init(String n, double p , String c , int r) // Declare o non-static members.
    {
        companyName = n;
        price = p;
        color =c;
        ram = r;
    }
    public void display ()
            // Non-Static method is use for TO display all Non-Static members.
    {
        System.out.println("-----------------------------");
        System.out.println("Comapny Name  :  "+ companyName);
        System.out.println("Price  :  "+ price);
        System.out.println("color :   "+ color);
        System.out.println("ram  :  "+ ram);
    }
}
class MainApp7 {
    static Scanner sc = new Scanner(System.in);

    public static Laptop getLaptop()
            // Object of Laptop Class,
    {
        Laptop l1 = new Laptop();   /// Acss Non-Static in another non-Static method use Class Name as reerence.
        System.out.println("Enter Company Name :-->");
        String n = sc.next();
        System.out.println("Enter Price :-->");
        double p = sc.nextDouble();
        System.out.println("Enter the color :-->");
        String c = sc.next();
        System.out.println("Enter the laptop Ram :-->");
        int r = sc.nextInt();
        l1.init(n, p, c, r);
        return l1;
    }
    public static void main(String[] args) {
        Laptop l1 = getLaptop();
        Laptop l2 = getLaptop();
        l1.display();
        l2.display();
        l1.display();
    }
}