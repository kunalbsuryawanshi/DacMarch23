import java.util.Scanner;
class Account
{
    private String name;
    private static int accountnumber = 1000;
    private double balance;

    public Account()
    {

    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAccountNumber(int accountnumber)
    {
        this.accountnumber = accountnumber + 1;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public String getName()
    {
        return this.name;
    }
    public  int getAccountNumber()
    {
        return this.accountnumber;
    }
    public double getBalance()
    {
        return this.balance;
    }


}
class Record
{
    static Scanner sc = new Scanner(System.in);
    Account A1 = new Account();
    public void creatAccount()
    {
        
        System.out.println("Name : ");
        sc.nextLine();
        A1.setName(sc.nextLine());
        A1.setAccountNumber(A1.getAccountNumber());
    }
    public void depositMoney()
    {
        System.out.print("Enter the Ammount : ");
        double balance = sc.nextDouble();
        System.out.print("Enter the Account No : ");
        int accountnumber =sc.nextInt();
        if(A1.getAccountNumber() == accountnumber)
        {
            A1.setBalance(balance);
        }
        else
        System.out.println("Invalid Account Number ");
    }
    public void withdrawMoney( )
    {
        System.out.print("Enter the Amount : ");
        double amount = sc.nextDouble();
        System.out.print("Enter the Account No : ");
        int accountnumber =sc.nextInt();
        if(A1.getBalance() >= amount && A1.getAccountNumber() == accountnumber)
        {
            double amt = A1.getBalance() - amount;
            A1.setBalance(amt);
            System.out.println(amount+"$ withdrawal from your bank account ");
            System.out.println("Your account balance is : "+amt+"$");
        }
        else
        {
            System.out.println("Unsufficent balance or Invalid Account No");
        }
    }
    void accountBalance()
    {
        System.out.print("Enter the Account No : ");
        int accountnumber =sc.nextInt();
        if(A1.getAccountNumber() == accountnumber)
        {
            System.out.println("Your account balance is : "+A1.getBalance()+"$");
        }
        else
        System.out.println("Invalid Account No");
    }

    public void printInformation()
    {
        System.out.print("Enter the Account No : ");
        int accountnumber = sc.nextInt();
        if(A1.getAccountNumber() == accountnumber)
        {
            if(A1.getName() != null)
            {
                System.out.println("Name : "+A1.getName());
                System.out.println("Account Number : "+A1.getAccountNumber());
                System.out.println("Account Balance : "+A1.getBalance()+"$");
            }
            else
            {
                System.out.println("You do not have Account ");
            }
        }
        else
        System.out.println("Invalid Accound Number");
    }   
    public static int menuList()
    {
        System.out.println();
        System.out.println("0. Exit : ");
        System.out.println("1. Create Account : ");
        System.out.println("2. Deposit Money : ");
        System.out.println("3. Withdraw Money : ");
        System.out.println("4. Account Balance : ");
        System.out.println("5. Account Holder Information : ");
        System.out.print("Enter Choice : ");
        return sc.nextInt();
    }

}
class Program
{
    public static void main(String[] args)
    {
        int choice;
        Record R1 = new Record();
        while((choice = R1.menuList()) != 0)
        {
            switch (choice)
            {
                case 1:
                    {
                        R1.creatAccount();
                        break;
                    }
                case 2:
                    {
                        
                        R1.depositMoney( );
                        break;
                    }
                case 3:
                    {
                        
                        R1.withdrawMoney();
                        break;
                    }
                case 4:
                    {
                        R1.accountBalance();
                        break;
                    }
                case 5:
                    {
                        R1.printInformation();
                        break;
                    }
                     
            }
        }

    }
}