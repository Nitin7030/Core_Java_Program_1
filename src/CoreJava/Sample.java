package CoreJava;

public class Sample
{

        int a = 60;        // Non static Member
        public void display()   // Non Static fun Menber
        {
            System.out.println("display Method");
        }


}

class mainApp{
    public static void main(String[] args) {
        System.out.println("Main Method ");
        new Sample().display();
        int sum = new Sample().a;
    }
}
