package BackUp;

class  Product
{
    String ProductName;
    double Price;
    String  Productid;

    String  Cateogary;


    public void init (String n, double p, String c,String r)
    {
        ProductName = n;
        Price = p;
        Productid = c;
        Cateogary  = r;
    }

    public void display()
    {
        System.out.println("-----------------------------------------------");
        System.out.println("ProductName"+ ProductName);
        System.out.println("ProductPrice "+ Price);
        System.out.println("Product id "+ Productid);
        System.out.println("Cat" + Cateogary);
    }





}
