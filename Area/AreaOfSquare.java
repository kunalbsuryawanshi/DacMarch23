import java.util.Scanner;

class AreaOfSquare
{
	double side;
	double Area;
	
	double CalArea()
	{
		Area = side * side;
		return Area;
	}
	
	void PrintArea()
	{
		System.out.println("Area Of Square = "+Area);
	}
	
	public static void main(String args[])
	{
		AreaOfSquare S1 = new AreaOfSquare();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Side = ");
		S1.side = sc.nextDouble();
		
		S1.Area = S1.CalArea();
		
		S1.PrintArea();
		
	}
}