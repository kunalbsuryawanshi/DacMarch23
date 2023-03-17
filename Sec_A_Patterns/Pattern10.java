class Pattern10
{
	public static void main(String args[])
	{
		for(char i = 'E';i>='A';i--)
		{
			for(char j =i;j>='A';j--)
			{
				System.out.print(" ");
			}
			for(char k = i;k<='E';k++)
				{
					System.out.print(" "+k);
				}
				System.out.println();
		}
	}
}