import java.util.Scanner;
class Compare
{
	public static void main(String args[])
	{
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num1 =");
		num1 = sc.nextInt();
		System.out.println("Enter the Num2 =");
		num2 = sc.nextInt();
		
		String ans =(num1 > num2)?"Add":"Sub";
        
        if(ans == "Add")
		{
			System.out.println("Ans ="+(num1+num2));
		}			
		else
		{
			System.out.println("Ans ="+(num1-num2));
		}
	}
}
