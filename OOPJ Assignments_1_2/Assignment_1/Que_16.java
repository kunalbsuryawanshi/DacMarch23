class Que_16
{
    public static void main(String args[])
    {
        int num1 = 100;
        String S1 = Integer.toString(num1);
        System.out.println("int --> String : "+S1);

        Integer I1 = new Integer(num1);
        System.out.println("int --> Integer Instance : "+I1);
        
        String S2 = "102";
        String sc = new String(S2);
        
        int num2 = 0;
        Integer I2 = new Integer(num2 = Integer.parseInt(sc));
        System.out.println("String Instance --> Integer Instance : "+I2);

    }
}