import java.util.Scanner;
class Que_26
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 = ");
        float num1 = sc.nextFloat();
        System.out.print("Enter Num2 = ");
        float num2 = sc.nextFloat();

        float max = Math.max(num1, num2);
        System.out.println("MAX NUM : "+max);

        float min = Math.min(num1, num2);
        System.out.println("MIN NUM : "+min);

        float ans = Float.sum(num1, num2);
        System.out.println("Addition : "+ans);
    }
}