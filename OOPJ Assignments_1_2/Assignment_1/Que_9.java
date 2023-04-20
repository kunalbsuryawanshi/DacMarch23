class Que_9
{
    public static void main(String args[])
    {
        byte b = 123;
        Byte B1 = new Byte(b);

        byte b1 = B1.byteValue();
        System.out.println("Byte Instance into byte : "+b1);

        short s1 = B1.shortValue();
        System.out.println("Byte Instance into short : "+s1);

        int x1 = B1.intValue();
        System.out.println("Byte Instance into int : "+x1);

        long l1 = B1.longValue();
        System.out.println("Byte Instance into long : "+l1); 

        float f1 = B1.floatValue();
        System.out.println("Byte Instance into float : "+f1);

        double d1 = B1.doubleValue();
        System.out.println("Byte Instance into double : "+d1);
    }
}