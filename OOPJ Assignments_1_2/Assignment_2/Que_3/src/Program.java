import java.util.Scanner;
class Book
{
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price = 50;
    int quantity;

    Book()
    {
        
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    public int getQuantity()
    {
        return this.quantity;
    }
    public double getPrice()
    {
        return this.price;
    }

}
class AcceptRecord
{
    Book B1 = new Book();
    private static Scanner sc = new Scanner(System.in);
   public void increaseQuantity()
   {
        int quantity  = B1.quantity + 1;
        B1.setQuantity(quantity);
   }
   public void decreaseQuantity()
   {
        if(B1.quantity != 0)
        {
            int quantity = B1.quantity - 1;
            B1.setQuantity(quantity);
        }
        else
        System.out.println("Inventory Empty");
   }
   public void inventoryValue()
   {
        double value = B1.getPrice() * B1.getQuantity();
        System.out.println("Inventory value : "+value);
   }
   public void printRecord()
   {
        System.out.println("Quantity : "+B1.getQuantity());
   }
   public static int menuList()
   {
        System.out.println();
        System.out.println("0. Exit : ");
        System.out.println("1. Increase quantity : ");
        System.out.println("2. Decrease quqntity : ");
        System.out.println("3. inventory value : ");
        System.out.println("4. Quantity : ");
        System.out.println("Enter choice");
        return sc.nextInt();
   }

}
class Program
{
    public static void main(String args[])
    {
        AcceptRecord A1 = new AcceptRecord();
        int choice;
        while((choice = A1.menuList())!=0)
        {
            switch(choice)
            {
                case 1:
                    {
                        A1.increaseQuantity();
                        break;
                    }
                case 2:
                    {
                        A1.decreaseQuantity();
                        break;
                    }
                case 3:
                    {
                        A1.inventoryValue();
                        break;
                    }
                case 4:
                    {
                        A1.printRecord();
                        break;
                    }
            }
        }
    }
}