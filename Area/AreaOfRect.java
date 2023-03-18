import java.util.Scanner;

public class AreaOfRect
{
	double l;
	double w;
	double Area;
	
	double CalArea()
	{
		Area = l * w;
		return Area;
	}
	
	void PrintArea()
	{
		System.out.println("Area Of Rectangle = "+Area);
	}
	
	public static void main(String args[])
	{
		AreaOfRect R1 = new AreaOfRect();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Lenght = ");
		R1.l = sc.nextDouble();
		
		System.out.println("Enter the Width = ");
		R1.w = sc.nextDouble();
		
		R1.Area = R1.CalArea();
		
		R1.PrintArea();
		
		
	}
}