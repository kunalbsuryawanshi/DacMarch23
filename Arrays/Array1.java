import java.util.Scanner;
class Array1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter choice : ");
		
		
		for(int i = 0;i<5;i++)
		{
		    int ch = sc.nextInt();
			arr[i] = ch;
			
		}
		for(int i = 0;i<5;i++)
		{
			System.out.println("Elemant at arr ["+i+"] = "+arr[i] );
		}
	}
}