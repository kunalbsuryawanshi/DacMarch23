import java.util.Scanner;

public class AreaOfCircle
{
	double r;
	double pi = 3.145;
	double Area;
	
	double CalArea()
	{
		Area = pi*r*r;
		return Area;
	}
	
	void PrintArea()
	{
		System.out.println("Area Of Circle = "+Area);
	}
	
	public static void main(String args[])
	{
		AreaOfCircle A1 = new AreaOfCircle();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Radius = ");
		A1.r = sc.nextDouble();
		
		A1.Area = A1.CalArea();
		
		A1.PrintArea();
		
		
	}
}