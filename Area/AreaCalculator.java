import java.util.Scanner;

class AreaCalculator
{
	//--------------------------Area Of Cicle------------------------------------
	
	double Radius;
	double pi = 3.145;
	double AreaOfCircle;
	
	double CalAreaOfCircle()
	{
		AreaOfCircle = pi*Radius*Radius;
		return AreaOfCircle;
	}
	
	void PrintAreaOfCircle()
	{
		System.out.println("Area Of Circle = "+AreaOfCircle);
	}
	
	//--------------------------Area Of Triangle------------------------------------
	
	double height;
	double base;
	double AreaOfTriangle;
	
	double CalAreaOfTriangle()
	{
		AreaOfTriangle = (height * base)/2;
		return AreaOfTriangle;
	}
	
	void PrintAreaOfTriangle()
	{
		System.out.println("Area Of Triangle = "+AreaOfTriangle);	
	}
	
	//--------------------------Area Of Rectangle------------------------------------
	
	double lenght;
	double width;
	double AreaOfRectangle;
	
	double CalAreaOfRectangle()
	{
		AreaOfRectangle = lenght * width;
		return AreaOfRectangle;
	}
	
	void PrintAreaOfRectangle()
	{
		System.out.println("Area Of Rectangle = "+AreaOfRectangle);
	}
	
	//--------------------------Area Of Square------------------------------------
	
	double side;
	double AreaOfSquare;
	
	double CalAreaOfSquare()
	{
		AreaOfSquare = side * side;
		return AreaOfSquare;
	}
	
	void PrintAreaOfSquare()
	{
		System.out.println("Area Of Square = "+AreaOfSquare);
	}
	
	//-------------------------------------------------Main-----------------------------------------------------
	
	public static void main(String args[])
	{
		int choice;
		AreaCalculator A1 = new AreaCalculator();
		
		System.out.println("1.Calculate Area Of Circle");
		System.out.println("2.Calculate Area Of Triangle");
		System.out.println("3.Calculate Area Of Rectangle");
		System.out.println("4.Calculate Area Of Square");
		System.out.println();
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice = ");
		choice = sc.nextInt();
		
		switch(choice)
		{
			//--------------------------Area Of Cicle------------------------------------
			case 1:
			{
				System.out.println();
				System.out.println("Enter the Radius = ");
				A1.Radius = sc.nextDouble();
				A1.AreaOfCircle = A1.CalAreaOfCircle();
				A1.PrintAreaOfCircle();
				break;
				
			}
			//--------------------------Area Of Triangle------------------------------------
			case 2:
			{
				System.out.println();
				System.out.println("Enter the Height = ");
				A1.height = sc.nextDouble();
				System.out.println("Enter the Base = ");
				A1.base = sc.nextDouble();
				A1.AreaOfTriangle = A1.CalAreaOfTriangle();
				A1.PrintAreaOfTriangle();
				break;
			}
			//--------------------------Area Of Rectangle------------------------------------
			case 3:
			{
				System.out.println();
				System.out.println("Enter the Lenght = ");
				A1.lenght = sc.nextDouble();
				System.out.println("Enter the Width = ");
				A1.width = sc.nextDouble();
				A1.AreaOfRectangle = A1.CalAreaOfRectangle();
				A1.PrintAreaOfRectangle();
				break;
			}
			//--------------------------Area Of Square------------------------------------
			case 4:
			{
				System.out.println();
				System.out.println("Enter the Side = ");
				A1.side = sc.nextDouble();
				A1.AreaOfSquare = A1.CalAreaOfSquare();
				A1.PrintAreaOfSquare();
				break;
			}
			default:
			System.out.println();
			System.out.println("Invaid Choice");
		}
		
	}
}
