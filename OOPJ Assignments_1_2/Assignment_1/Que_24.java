class Que_24
{
    public static void main(String args[])
    {
        float f1 = 20.23f;
        String s1 = Float.toString(f1);
        System.out.println("float -->String : "+s1);

        Float F1 = new Float(f1);
        System.out.println("float -->Float Instance : "+F1);

        String s2 = "30.25";
        String S1 = new String(s2);

        float f2 = 0.00f;
        Float F2 = new Float(f2 = Float.parseFloat(S1));
        System.out.println("String Instace -->Float Instance : "+F2); 

        String s4 = Float.toHexString(f1);
        System.out.println("float -->Hexadecimal : "+s4);
    }
}