class TempConversion
{
	public static void main(String args[])
	{
		double C = 30.65;
		System.out.println("Temp in Celsius :-             "+C);
		double F = (C*1.8)+32;
		System.out.println("Celsius to Fahrenheit :-       "+F);
		
		
		double _F = 87.50;
		System.out.println("Temp in Fahrenheit :-          "+_F);
		double _C = (_F - 32)*0.556;
		System.out.println("Fahrenheit to Celsius :-       "+_C);
		
	}
}