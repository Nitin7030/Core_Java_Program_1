package CoreJava;

import java.util.Scanner;

public class Product
{
    public int pId;
    public String pName;
    public double pPrice;

    public void display()
    {
        System.out.println("---------------------------------------");
        System.out.println("ID"+pId);
        System.out.println("Name"+pName);
        System.out.println("Price"+pPrice);
    }

}

class MainApp8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Product p1 = getProduct();
        Product p2 = getProduct();
//        Product p3 = getProduct();

        if (p1.pPrice < 100)
            p1.display();
        if (p2.pPrice < 100)
            p2.display();


    }

    public static Product getProduct() {
        System.out.println("---------------");
        Product Pro = new Product();
        System.out.println("Enter The ID");

        Pro.pId = sc.nextInt();
        System.out.println("Enter the Name");
        Pro.pName = sc.next();

        System.out.println("Enter Price");
        Pro.pPrice = sc.nextDouble();
        return Pro;
    }
}
