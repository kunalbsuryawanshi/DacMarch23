class CustomDate {
    private int day;
    private int month;
    private int year;
    private LocalDate date;


    public boolean isValid(){
        try{
            this.date = LocalDate.of(this.year,(this.month),this.day);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    public int getDayOfWeek(){
        int day =  this.date.getDayOfWeek().getValue();
        if (day == 7)
            return 0;
        return day;
    }

    public boolean isLeapYear(){
        return (this.year % 4 == 0 && this.year % 100 != 0 || this.year%400 == 0) ?  true : false;
    }

    public int getNextDay(){
        int day = getDayOfWeek();
        if (day == 6)
            return 0;
        return day + 1;
    }

    public int getPreviousDay(){
        int day = getDayOfWeek();
        if (day == 0)
            return 6;
        return day -1;
    }


    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
class Program
{
    public static void main(String args[])
    {
		Scanner scan = new Scanner(System.in);
		CustomDate cd = new CustomDate();
		System.out.println("Enter the day of the month");
		cd.setDay(scan.nextInt());
		System.out.println("Enter the month of the year");
		cd.setMonth(scan.nextInt());
		System.out.println("Enter the  year");
		cd.setYear(scan.nextInt());

		String s = cd.isValid() ? "Accepted" : "Rejected";
		System.out.println(s);
		if (!cd.isValid()){
			System.out.println("Invalid Date");
			System.exit(0);
		}
		System.out.println(cd.getDayOfWeek());
		System.out.println(cd.getNextDay());
		System.out.println(cd.getPreviousDay());
		System.out.println(cd.isLeapYear());


		scan.close();
    }
