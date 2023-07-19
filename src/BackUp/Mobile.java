package BackUp;
public class Mobile
{
    String Company;
    int  ModelNO;
    int Memoery;
    int Ram;
    String color;
    int Price;
    public void init (String C,int M,int Me,int R, String Cc,int P)
    {
        Company = C;
        ModelNO = M;
        Memoery = Me;
        Ram = R;
        color = Cc;
        Price = P;
    }
    public void Show()
    {
        System.out.println("-------------------------");
        System.out.println("Company Name : "+Company);
        System.out.println("Model NO "+ ModelNO);
        System.out.println("Meeoery"+Memoery);
        System.out.println("Rma"+ Ram);
        System.out.println("Color"+color);
        System.out.println("Price"+Price);
    }
}
