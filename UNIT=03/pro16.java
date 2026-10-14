
import java.util.Calendar;

class DateAddDemo 
{
    public static void main(String[] args) 
	{
        Calendar c = Calendar.getInstance();

        System.out.println("Current Date: " +
            c.getTime());

        c.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("After 5 Days: " +
            c.getTime());

        c.add(Calendar.MONTH, -1);
        System.out.println("One Month Before: " +
            c.getTime());
    }
}
