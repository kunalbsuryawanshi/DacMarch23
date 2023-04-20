import java.util.Scanner;
class Que_30
{
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 = ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Num2 = ");
        double num2 = sc.nextDouble();

        double max = Math.max(num1, num2);
        System.out.println("MAX NUM : "+max);

        double min = Math.min(num1, num2);
        System.out.println("MIN NUM : "+min);

        double ans = Double.sum(num1, num2);
        System.out.println("Addition : "+ans);
    }
}