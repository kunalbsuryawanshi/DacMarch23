import java.util.Scanner;
class BillDetails
{
    private String customerName;
    private double untisConsumed;
    BillDetails()
    {

    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    public void setUnitsConsumed(double untisConsumed)
    {
        this.untisConsumed = untisConsumed;
    }
    double getUnitsConsumed()
    {
        return this.untisConsumed;
    }
    String getCustomerName()
    {
        return this.customerName;
    }
}
class ElectricityBill
{
    private double billAmount;
    BillDetails B1 = new BillDetails();

    public void acceptDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        B1.setCustomerName(sc.nextLine());

        System.out.print("unitsConsumed : ");
        B1.setUnitsConsumed(sc.nextDouble());
        calculateBillAmount();
        System.out.println();
    }
    void calculateBillAmount()
    {
        double d = B1.getUnitsConsumed();
        if(d<=100)
        {
            this.billAmount = d * 5;
        }
        else if(d>100 && d<=300)
        {
            this.billAmount = d * 7;
        }
        else
        {
            this.billAmount = d * 10;
        }
       
    }
    void printDetails( )
    {
        System.out.println("Name : "+B1.getCustomerName());
        System.out.println("UnitsConsumed : "+B1.getUnitsConsumed());
        System.out.println("BillAmount : "+this.billAmount);
    }
}

class Program
{
    public static void main(String args[])
    {
        ElectricityBill E1 = new ElectricityBill();
        E1.acceptDetails();
        E1.printDetails();
    }
}