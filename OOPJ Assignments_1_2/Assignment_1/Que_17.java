class Que_17
{
    public static void main(String args[])
    {
        int num1 = 128;
        Integer I1 = new Integer(num1);

        byte b1 = I1.byteValue();
        System.out.println("Integer Instance -->byte : "+b1);

        short s1 = I1.shortValue();
        System.out.println("Integer Instance -->short : "+s1);

         int num2 = I1.intValue();
        System.out.println("Integer Instance -->int: "+num2);

         long l1 = I1.longValue();
        System.out.println("Integer Instance -->long : "+l1);

         float f1 = I1.floatValue();
        System.out.println("Integer Instance -->float : "+f1);

         double d1 = I1.doubleValue();
        System.out.println("Integer Instance -->doouble : "+d1);

    }
}