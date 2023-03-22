import java.util.Scanner;
class PrintDigits
{
	public static void main(String args[])
	{
		int sum =0,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		while(a>0)
		{
			n=a%10;
			sum = sum+n;
			a=a/10;
			
		}
		System.out.println("Sum of Digits:"+sum);
	}
}