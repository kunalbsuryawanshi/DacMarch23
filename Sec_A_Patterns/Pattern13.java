class Pattern13
{
	public static void main(String args[])
	{
		for(char i = 'A';i<='E';i++)
		{
			for(int j =i;j<='E';j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 'A';k<=i;k++)
				{
					System.out.print(" "+i);
				}
				System.out.println();
		}
	}
}