import java.util.Scanner;

class Even_Ternary
{
	public static void main(String args[])
	{
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num =");
		num = sc.nextInt();
		
		String ans = (num%2 == 0)?"Even":"Odd";
		
		System.out.println("Number is "+ans);
		
		
	}
}