import java.util.Scanner;
class Vehicle
{
    private String vehicleType;
    private int numAxles;
    private int distance;
    private double tollFee;
    private double amountDue;
    Vehicle()
    {

    }
    public void setVehicleType(String vehicleType)
    {
        this.vehicleType = vehicleType;
    }
    public void setnumAxles(int numAxles)
    {
        this.numAxles = numAxles;
    }
    public void setDistanceTravelled(int distance)
    {
        this.distance = distance;
    }
    public void setTollFee(double tollFee)
    {
        this.tollFee = tollFee;
    }
    public void setAmountDue()
    {
        this.amountDue = amountDue;
    }
    public String getVehicleType()
    {
        return this.vehicleType;
    }
    public int getnumAxles()
    {
        return this.numAxles;
    }
    public double getDistanceTravelled()
    {
        return this.distance;
    }
    public double getTollFee()
    {
        return this.tollFee;
    }

}
class Record
{
    private static Scanner sc = new Scanner(System.in);
    Vehicle V1 = new Vehicle();
    public void showVehicleType()
    {
        System.out.println();
        System.out.print("Enter the vehicle type : ");
        sc.nextLine();
        V1.setVehicleType(sc.nextLine());
    }
    public void numberOfAxles()
    {
        System.out.println();
        System.out.print("Enter number of axles : ");
        V1.setnumAxles(sc.nextInt());
    }
    public void distanceTravelled()
    {
        System.out.println();
        System.out.print("Enter the distance travelled : ");
        V1.setDistanceTravelled(sc.nextInt());
    }
    public void CalculateToll()
    {
        double tollFee = 0.0;
        if(V1.getVehicleType() != null && V1.getDistanceTravelled() != 0)
        {
            if(V1.getVehicleType() == "Truck" || V1.getVehicleType() == "truck")
            {
                tollFee = (V1.getDistanceTravelled() * V1.getnumAxles()) * 0.50;
                V1.setTollFee(tollFee);
            }
            else
            {
                tollFee = (V1.getDistanceTravelled() * V1.getnumAxles()) * 0.25;
                V1.setTollFee(tollFee);
            }
        }
        else
        System.out.println("Error: Fill all the above info !!!");
    }
    public void generateBill()
    {
        if(V1.getTollFee() != 0.0)
        {
            System.out.println();
            System.out.println("Vehicle Type : "+V1.getVehicleType());
            System.out.println("Number of Axles : "+V1.getnumAxles());
            System.out.println("Distance Travelled : "+V1.getDistanceTravelled());
            System.out.println("Total Bill Amount : "+V1.getTollFee());
        }
        else
        System.out.println("Error: Fill all the above info !!!");
    }
    public static int menuList()
    {
        System.out.println();
        System.out.println("1. Enter vehicle type : ");
        System.out.println("2. Enter number of axles : ");
        System.out.println("3. Enter distance travelled : ");
        System.out.println("4. Calculate toll fee : ");
        System.out.println("5. Generate bill : ");
        System.out.println("0. Exit : ");
        System.out.println();
        System.out.print("Enter Choice : ");
        return sc.nextInt();
    }
}
class Program
{
    public static void main(String args[])
    {
        int choice;
        Record R1 = new Record();
        while((choice = R1.menuList()) != 0)
        {
            switch (choice)
            {
                case 1:
                    {
                        R1.showVehicleType();
                        break;
                    }
                case 2:
                    {
                        R1.numberOfAxles();
                        break;
                    }
                case 3:
                    {
                        R1.distanceTravelled();
                        break;
                    }
                case 4:
                    {
                        R1.CalculateToll();
                        break;
                    }
                case 5:
                    {
                        R1.generateBill();
                        break;
                    }
            }
        }
    }
}