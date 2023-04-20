class Que_29
{
    public static void main(String args[])
    {
        double d1 = 25.65;
        Double D1 = new Double(d1);

        byte b1 = D1.byteValue();
        System.out.println("Double Instance -->byte : "+b1);

        short s1 = D1.shortValue();
        System.out.println("Double Instance -->short : "+s1);

         int num1 = D1.intValue();
        System.out.println("Double Instance -->int : "+num1);

         long l1 = D1.longValue();
        System.out.println("Double Instance -->long : "+l1);

         float f1 = D1.floatValue();
        System.out.println("Double Instance -->float : "+f1);

         double d2 = D1.doubleValue();
        System.out.println("Double Instance -->double : "+d2);
    }
}