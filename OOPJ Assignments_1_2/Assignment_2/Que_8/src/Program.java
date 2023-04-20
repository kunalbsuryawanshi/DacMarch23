import java.util.Scanner;
class Arithmetic
{
    private int numerator;
    private int denominator;
    Arithmetic()
    {
    
    }
    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }
    public int getNumerator()
    {
        return this.numerator;
    }
    public int getDenominator()
    {
        return this.denominator;
    }
}
class Calculation
{
    private static Scanner sc = new Scanner(System.in);
    Arithmetic A1 = new Arithmetic();
    Arithmetic A2 = new Arithmetic();

    public void firstRationalNum()
    {
        System.out.print("Enter the numerator : ");
        A1.setNumerator(sc.nextInt());
        System.out.print("Enter the denominator : ");
        A1.setDenominator(sc.nextInt());
    }
    public void secRationalNum()
    {
        System.out.print("Enter the numerator : ");
        A2.setNumerator(sc.nextInt());
        System.out.print("Enter the denominator : ");
        A2.setDenominator(sc.nextInt());
    }
    public void addition()
    {
        if(A1.getDenominator() == A2.getDenominator())
        {
            int num = Math.addExact(A1.getNumerator(), A2.getNumerator());
            System.out.println(num+"/"+A1.getDenominator());
        }
        else
        System.out.println("Denominators are diffrent");
    }
    public void subtraction()
    {
        if(A1.getDenominator() == A2.getDenominator())
        {
            int num = Math.subtractExact(A1.getNumerator(),A2.getNumerator());
            System.out.println(num+"/"+A1.getDenominator());
        }
        else
        System.out.println("Denominators are diffrent");
    }
    public void multiplication()
    {
        int numerator = Math.multiplyExact(A1.getNumerator() , A2.getNumerator());
        int denominator = Math.multiplyExact(A1.getDenominator() , A2.getDenominator());
        int ans = Math.floorDiv(numerator, denominator);
        // System.out.println(numerator+"/"+denominator);
        System.out.println("ans : "+ans);
    }
    public void divison()
    {
        int numerator = Math.multiplyExact(A1.getNumerator() , A2.getDenominator());
        int denominator = Math.multiplyExact( A1.getDenominator() , A2.getNumerator());
        int ans = Math.floorDiv(numerator, denominator);
        System.out.println("ans : "+ans);
        // System.out.println(numerator+"/"+denominator);
    }
    public void operation()
    {
        System.out.print("Enter the sign : ");
        String choice;
        while((choice = sc.next()) != "0")
        {
            switch (choice)
            {
                case "+":
                    {
                        addition();
                        break;
                    }
                case "-":
                    {
                        subtraction();
                        break;
                    }
                case "*":
                    {
                        multiplication();
                        break;
                    }
                case "/":
                    {
                        divison();
                        break;
                    }
            }
        }
    }
    public static int menuList()
    {
        System.out.println("0. Exit");
        System.out.println("1. Enter the 1st Rational num : ");
        System.out.println("2. Enter the 2nd Rational num : ");
        System.out.println("3. Enter Operation (+,-,*,/)");
        System.out.println();
        System.out.print("Enter choice : ");
        return sc.nextInt();

    }
}
class Program
{
    public static void main(String args[])
    {
        Calculation C1 = new Calculation();
        int choice;
        while((choice = C1.menuList()) != 0)
        {
            switch (choice)
            {
                case 1:
                    {
                        C1.firstRationalNum();
                        break;
                    }
                case 2:
                    {
                        C1.secRationalNum();
                        break;
                    }
                case 3:
                    {
                        C1.operation();
                        break;
                    }
            }
        }
    }
}