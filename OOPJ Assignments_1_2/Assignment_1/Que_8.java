class Que_8
{
    public static void main(String args[])
    {
        
        byte b1 = 102;
        String s1 = Byte.toString(b1);
        System.out.println("Byte --> String : "+s1);

        Byte B1 = new Byte(b1);
        System.out.println("byte value --> Byte Instance : "+B1);

        String s2 = "123";
        String S1 = new String(s2);

        byte b2 = 0;
        Byte B2 = new Byte(b2 = Byte.parseByte(S1));
        System.out.println("String Instance --> Byte Instance : "+B2);



    }
}
