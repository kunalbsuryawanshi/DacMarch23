import java.util.Scanner;

class Grade
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks out of 500 =");
		double Marks = sc.nextInt();
		
		double Percentage =((Marks/500)*100);
		System.out.println("Percentage ="+Percentage);
		
		if(Percentage > 95)
		{
			System.out.println("Distinction");
		}
		else if(Percentage >= 85)
		{
			System.out.println("Fisrt Grade");
		}
		else if(Percentage >= 75)
		{
			System.out.println("Second Division");
		}
		else
		{
			System.out.println("Average");
		}
	}
}