import java.util.Scanner;
class Array2
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
			System.out.println("Element at arr ["+i+"] = "+arr[i]);
		}
		System.out.println();
		
		for(int j = 0;j<1;j++)
		{
			for(int k = 0;k<5;k++)
			{
				if(arr[j]<arr[k])
				{
					arr[j]=arr[k];

				}
			}
			System.out.println("Maximum element in array = "+arr[j]);
		}
		System.out.println();
		
		for(int j = 1;j<=1;j++)
		{
			for(int k = 0;k<5;k++)
			{
				if(arr[j]>arr[k])
				{
					arr[j]=arr[k];

				}
			}
			System.out.println("Minimum element in array = "+arr[j]);
		}
		
	}
}