import java.util.Scanner;

class CreditHistory {
    private String name;
    private int creditHistory;
    private int creditUtilization;
    private boolean paymnetHistory;


    CreditHistory(String name, int creditHistory, int creditUtilization, boolean paymnetHistory){
        this.name = name;
        this.creditHistory = creditHistory;
        this.creditUtilization = creditUtilization;
        this.paymnetHistory = paymnetHistory;
    }

    public int calculateCreditScore(){
        if (paymnetHistory)
            return (creditHistory * 15) + (int)(creditUtilization * 30) + 55;
        else
            return (creditHistory * 15) + (int)(creditUtilization * 30) + 35;
        }
        

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditHistory() {
        return this.creditHistory;
    }

    public void setCreditHistory(int creditHistory) {
        this.creditHistory = creditHistory;
    }

    public int getCreditUtilization() {
        return this.creditUtilization;
    }

    public void setCreditUtilization(int creditUtilization) {
        this.creditUtilization = creditUtilization;
    }

    public boolean isPaymnetHistory() {
        return this.paymnetHistory;
    }

    public boolean getPaymnetHistory() {
        return this.paymnetHistory;
    }

    public void setPaymnetHistory(boolean paymnetHistory) {
        this.paymnetHistory = paymnetHistory;
    }
    
}
class Program
{
	public static void main(String args[])
	{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scan.nextLine();
        System.out.println("Enter credit history");
        int creditHistory = scan.nextInt();
        System.out.println("Enter credit utilization");
        int creditUtilization = scan.nextInt();
        System.out.println("Enter credit history");
        boolean paymnetHistory = scan.nextBoolean();
        CreditHistory cred = new CreditHistory(name, creditHistory, creditUtilization, paymnetHistory);

        System.out.println(cred.calculateCreditScore());
    
	}
}