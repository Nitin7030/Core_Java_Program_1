package Constructor;

public class Demo
{
    Demo()
    {
        System.out.println("Constructor !!");
    }
    public void display()
    {
        System.out.println("Display Merthod");
    }
}

class MainApp9
{
    public static void main(String[] args)
    {
        Demo d1 = new Demo();    // Call For Constructor
        d1.display();

    }
}
