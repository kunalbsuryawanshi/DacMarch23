class Que_20
{
    public static void main(String args[])
    {
        long l1 = 2000l;
        String s1 = Long.toString(l1);
        System.out.println("long -->String : "+s1);

        Long L1 = new Long(l1);
        System.out.println("long -->Long Instance : "+L1);

        String s2 = "3000";
        String S1 = new String(s2);

        long l2 = 0l;
        Long L2 = new Long(l2 = Long.parseLong(S1));
        System.out.println("String Instace -->Long Instance : "+L2); 

        String s3 = Long.toBinaryString(l1);
        System.out.println("long -->Binary : "+s3);

        String s4 = Long.toHexString(l1);
        System.out.println("long -->Hexadecimal : "+s4);

        String s5 = Long.toOctalString(l1);
        System.out.println("long -->Octal : "+s5);
    }
}