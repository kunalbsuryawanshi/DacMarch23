import java.util.Scanner;

public class AreaOfTriangle
{
	double height;
	double base;
	double Area;
	
	double CalArea()
	{
		Area = (height * base)/2;
		return Area;
	}
	
	void PrintArea()
	{
		System.out.println("Area Of Triangle = "+Area);	
	}
	
	public static void main(String args[])
	{
		AreaOfTriangle T1 = new AreaOfTriangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Height = ");
		T1.height = sc.nextDouble();
		
		System.out.println("Enter the Base = ");
		T1.base = sc.nextDouble();
		
		T1.Area = T1.CalArea();
		
		T1.PrintArea();
		
	}
}