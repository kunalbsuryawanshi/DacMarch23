class Que_28
{
    public static void main(String args[])
    {
        double d1 = 20.23;
        String s1 = Double.toString(d1);
        System.out.println("long -->String : "+s1);

        Double D1 = new Double(d1);
        System.out.println("long -->Long Instance : "+D1);

        String s2 = "3000";
        String S1 = new String(s2);

        double d2 = 0.0;
        Double D2 = new Double(d2 = Double.parseDouble(S1));
        System.out.println("String Instace -->Long Instance : "+D2); 

        String s4 = Double.toHexString(d1);
        System.out.println("double -->Hexadecimal : "+s4);
    }
}