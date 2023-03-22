import java.util.Scanner;

class Election
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age =");
		int age = sc.nextInt();
		System.out.println("If you have voter ID then type 1 if not then type 0 =");
		int VID = sc.nextInt();
		
		if(age >= 18 && VID == 1)
		{
			System.out.println("You are elegible for election");
		}
		else
		{
			System.out.println("You are not elegible for election");
		}
		
		
		
	}
}