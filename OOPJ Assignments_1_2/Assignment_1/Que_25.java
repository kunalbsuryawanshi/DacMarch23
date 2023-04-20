class Que_25
{
    public static void main(String args[])
    {
        float f1 = 20.25f;
        Float F1 = new Float(f1);

        byte b1 = F1.byteValue();
        System.out.println("Float Instance -->byte : "+b1);

        short s1 = F1.shortValue();
        System.out.println("Float Instance -->short : "+s1);

         int num1 = F1.intValue();
        System.out.println("Float Instance -->int : "+num1);

         long l2 = F1.longValue();
        System.out.println("Float Instance -->long : "+l2);

         float f2 = F1.floatValue();
        System.out.println("float Instance -->float : "+f2);

         double d1 = F1.doubleValue();
        System.out.println("FLoat Instance -->double : "+d1);
    }
}