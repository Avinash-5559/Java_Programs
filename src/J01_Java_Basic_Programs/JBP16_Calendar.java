package J01_Java_Basic_Programs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JBP16_Calendar {
    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        System.out.println("\nDate-Time Format with AM/PM : " + sdf.format(date));

        Calendar calendar = Calendar.getInstance();
        System.out.println();
        System.out.println("Current Day : " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Current Month : " + calendar.get(Calendar.MONTH));
        System.out.println("Current Year : " + calendar.get(Calendar.YEAR));
        System.out.println("Current Hour : " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current Minute : " + calendar.get(Calendar.MINUTE));
        System.out.println("Current Second : " + calendar.get(Calendar.SECOND));
        System.out.println("Current Millisecond : " + calendar.get(Calendar.MILLISECOND));
        System.out.println("Current Week in Month : " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

    }
}
