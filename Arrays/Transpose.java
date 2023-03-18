import java.util.Scanner;
class Transpose
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int Transpose[][] = new int[3][3];
		System.out.print("Enter the element : ");
		
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				int n = sc.nextInt();
				arr[i][j] = n;
			}
		}
		System.out.println();
		
		System.out.println("Printing the matrix without Transpose :");
		System.out.println();
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				System.out.print("  "+arr[i][j]+"  ");
			}
			System.out.println();
			System.out.println();
		}
		
		//-------------------------------------------Transpose----------------------------------
		
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				Transpose[i][j] = arr[j][i];
			
			}
			System.out.println();
		}
		System.out.println("Printing the matrix after Transpose :");
		System.out.println();
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				System.out.print("  "+Transpose[i][j]+"  ");
			}
			System.out.println();
			System.out.println();
		}
	}
}