class Que_6
{
    public static void main(String args[])
    {
        System.out.println();
            boolean b1 = true;
            String str1 = Boolean.toString(b1);
            System.out.printf("boolean to String : %9s\n",str1);

           String str2 = "False";
           boolean b2 = Boolean.valueOf(str2);
            System.out.printf("String to bollean : %10b\n",b2);

           boolean b3 = true;
           Boolean B1 =Boolean.valueOf(b3);
            System.out.printf("Bool Instance : %13b\n",B1);
        
            String str3 = "false";
            Boolean B2 = Boolean.valueOf(str3);
            System.out.printf("Bool Instance : %14b",B2);

    }
}