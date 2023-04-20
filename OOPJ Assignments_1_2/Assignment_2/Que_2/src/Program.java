import java.util.Scanner;
class BMICalculator   
{
    private double height;
    private double weight;
    
    BMICalculator()
    {

    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public double getHeight( )
    {
        return this.height;
    }
    public double getWeight( )
    {
        return this.weight;
    }
}

class BMITest
{
    private double BMI;
    BMICalculator B1 = new BMICalculator();
    public void acceptRecord()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height : ");
        B1.setHeight(sc.nextDouble());

        System.out.print("Enter Weight : ");
        B1.setWeight(sc.nextDouble());

        calculateBMI(B1.getHeight(), B1.getWeight());
    }

    public void calculateBMI(double height, double weight )
    {
        BMI = weight / (height * height);
    }
    public void printBMI( )
    {
        System.out.println("BMI : "+BMI);

    }
}

class Program
{
    public static void main(String args[])
    {
        BMITest T1 = new BMITest( );
        T1.acceptRecord( );
        T1.printBMI( );
    }
}
