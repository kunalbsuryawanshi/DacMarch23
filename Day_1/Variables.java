import java.util.Scanner;

class Variables
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the value of a =");
	  int a = sc.nextInt();
	
	  System.out.println("Enter the value of b =");
	  int b = sc.nextInt();
	
	  System.out.println("Enter the value of c =");
	  int c = sc.nextInt();
	  
	  if(a>b && a>c)
	  {
		  System.out.println("Max Value ="+a);
	  }
	  else if(b>a && b>c)
	  {
		  System.out.println("Max value ="+b);
	  }
	  else
		  System.out.println("Max value ="+c);	
	  
	  
	  
	  
	  if(a<b && a<c)
	  {
		  System.out.println("Min Value ="+a);
	  }
	  else if(b<a && b<c)
	  {
		  System.out.println("Min Value ="+b);
	  }
	  else
		  System.out.println("Min Value ="+c);
	}
	
	
}