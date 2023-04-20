class Que_14
{
    public static void main(String args[])
    {
        short s = 123;
        Short S1 = new Short(s);
        //System.out.println(S1);

        byte b1 = S1.byteValue();
        System.out.println("Short Instance -->byte : "+b1);

        short s1 = S1.shortValue();
        System.out.println("Short Instance -->short : "+s1);

        int x1 = S1.intValue();
        System.out.println("Short Instance -->int : "+x1);

        float f1 = S1.floatValue();
        System.out.println("Short Instance -->float : "+f1);

        double d1 = S1.doubleValue();
        System.out.println("Short Instance -->double : "+d1);

    }
}