class Compound_Intrest
{
	public static void main(String args[])
	{
		double principal = 50000000;
		int N = 5;
		float Rate = 10.75f;
		double Amount = principal*((1+Rate/100)*(1+Rate/100)*(1+Rate/100)*(1+Rate/100)*(1+Rate/100));
		System.out.println("Amount = "+Amount);
		double Compound_Intrest = Amount - principal;
		System.out.println("Compound_Intrest = "+Compound_Intrest);
		
	}
}