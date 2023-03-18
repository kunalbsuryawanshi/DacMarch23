import java.util.Scanner;

class Array2D
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		int arr[][] = new int[3][3];
		
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				int ch = sc.nextInt();
				arr[i][j] = ch;
				
			}
		}
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
		System.out.println();
		
		//----------------------------------Addition--------------------------------------------
		
		int add = 0;
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				add += arr[i][j];
			}
		}
		System.out.println("Addition of all element : "+add);
		System.out.println();
		//-----------------------------------Subtraction---------------------------------------------
		
		int sub = 0;
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				if(sub>arr[i][j])
				{
					sub -= arr[i][j];
				}
				else
				{
					sub = arr[i][j] - sub;
				}
			}
		}
		System.out.println("Subtraction of all element : "+sub);
		System.out.println();
		//-------------------------------------Multiplication---------------------------------
		
		int mul = 1;
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				mul *= arr[i][j]; 
			}
		}
		System.out.print("Multiplication of all element : "+mul);
		System.out.println();
	}
}