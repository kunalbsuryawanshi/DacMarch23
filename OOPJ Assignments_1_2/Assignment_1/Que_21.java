class Que_21
{
    public static void main(String args[])
    {
        long l1 = 200l;
        Long L1 = new Long(l1);

        byte b1 = L1.byteValue();
        System.out.println("Long Instance -->byte : "+b1);

        short s1 = L1.shortValue();
        System.out.println("Long Instance -->short : "+s1);

         int num1 = L1.intValue();
        System.out.println("Long Instance -->int : "+num1);

         long l2 = L1.longValue();
        System.out.println("Long Instance -->long : "+l2);

         float f1 = L1.floatValue();
        System.out.println("Long Instance -->float : "+f1);

         double d1 = L1.doubleValue();
        System.out.println("Long Instance -->double : "+d1);
    }
}