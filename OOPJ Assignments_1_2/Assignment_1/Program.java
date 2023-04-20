import java.util.Calendar;
class Program 
{
    public static void main(String[] args) {
        
        Calendar c =  Calendar.getInstance();
        int day = c.get( c.DATE );
        int month = c.get( c.MONTH ) + 1;
        int year = c.get( c.YEAR ); 

        System.out.println( day +"/" + month+"/"+year);
    }
}