import java.util.Scanner;
class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		if(a%4==0)
		{
			System.out.println("It is a Leap Year");
		}
		else
		{
			System.out.println("It is not a Leap Year");
		}
	}
}