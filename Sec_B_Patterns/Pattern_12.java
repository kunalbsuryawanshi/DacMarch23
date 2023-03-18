class Pattern_12
{
	public static void main(String args[])
	{
		for(int i = 5;i>=1;i--)
		{
			for(int k = 1;k<2;k++)
			{
				System.out.print(" ");
			}
			for(int j = i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a = 2;a<=5;a++)
		{
			for(int k = 1;k<2;k++)
			{
				System.out.print(" ");
			}
			for(int b = 1;b<=a;b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}