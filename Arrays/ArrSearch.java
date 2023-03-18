import java.util.Scanner;

class ArrSearch
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
		System.out.println();
		for(int a : arr)
		{
			System.out.print(" "+a);
		}
		System.out.println();
		
		//-----------------------------------------Search---------------------------------
		
		System.out.println("Search element : ");
		int ele = sc.nextInt();
		System.out.println();
		for(int i = 0;i<5;i++)
		{
			if(arr[i]==ele)
			{
				System.out.print(ele+" is at arr["+i+"]");
			}
		}
	}
}
