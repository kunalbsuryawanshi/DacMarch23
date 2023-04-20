import java.util.Scanner;
class Que_18
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 = ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num2 = ");
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);
        System.out.println("MAX NUM : "+max);

        int min = Math.min(num1, num2);
        System.out.println("MIN NUM : "+min);

        int ans = Math.addExact(num1, num2);
        System.out.println("Addition : "+ans);
    }
}