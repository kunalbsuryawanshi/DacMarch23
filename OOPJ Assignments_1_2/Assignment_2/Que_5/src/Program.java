import java.util.Scanner;
class Details{

    private String customername;
    private long phonenumber;
    private int numberofcalls;
    private int callduration;
    int amount;

    public Details(){


    }
    public void setCustomerName(String customername){
        this.customername = customername;
    }
    public void setPhoneNumber(long phonenumber){
        this.phonenumber = phonenumber;
    }
    public void setNumberOfCalls(int numberofcalls){
        this.numberofcalls = numberofcalls;
    }
    public void setCallDuration(int callduration){
        this.callduration = callduration;
    }
    public String getCustomerName(){
        return this.customername = customername;
    }
    public long getPhoneNumber(){
        return this.phonenumber = phonenumber;
    }
    public int getNumberOfCalls(){
        return this.numberofcalls = numberofcalls;
    }

}
class PhoneBill{

    Details D1 = new Details();

    public void acceptRecord(){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        D1.setCustomerName(sc.nextLine());
        System.out.print("Enter mobile number : ");
        D1.setPhoneNumber(sc.nextLong());
        System.out.print("Enter number of call :");
        D1.setNumberOfCalls(sc.nextInt());
        //D1.setCallDuration(sc.nextInt());
        calculateBillAmount(D1.getNumberOfCalls());
    }
    public void calculateBillAmount(int numberofcalls){
        int i = numberofcalls;
        if(i<=100){
            D1.amount = i * 50;
        }
        if(i>=100){
            D1.amount = i * 25;
        }
    }
    public void printRecord(){
            System.out.println("Customer Name : "+D1.getCustomerName());
            System.out.println("Phone Number : "+D1.getPhoneNumber());
            System.out.println("Bill Amount : "+D1.amount);

        }
}
class Program{

    public static void main(String args[]){
        PhoneBill P1 = new PhoneBill();
        P1.acceptRecord();
        P1.printRecord();
        
    }
}