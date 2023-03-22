class GrossSalary
{
	public static void main(String args[])
	{
		double ba = 10000.8989009;
		System.out.println("Basic Salary :-          "+ba);
		
		double ta = 5600.6778;
		System.out.println("TA is :-                 "+ta);
		
		double da =0.14*ba;
		System.out.println("DA is :-                 "+da);
		
		double PetAll = 7000.3443534546;
		System.out.println("Petrol Allowance :-      "+PetAll);
		
		double tax = 0.0176*da;
        System.out.println("Tax Allowance :-         "+tax);
		
        double Gross_Salary	= ba+ta+da+PetAll-tax;
        System.out.println("Gross_Salary :-          "+Gross_Salary);
		
	}
}