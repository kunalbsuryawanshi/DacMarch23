import java.util.Scanner;
class Que_22
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 = ");
        long num1 = sc.nextLong();
        System.out.print("Enter Num2 = ");
        long num2 = sc.nextInt();

        long max = Math.max(num1, num2);
        System.out.println("MAX NUM : "+max);

        long min = Math.min(num1, num2);
        System.out.println("MIN NUM : "+min);

        long ans = Math.addExact(num1, num2);
        System.out.println("Addition : "+ans);
    }
}