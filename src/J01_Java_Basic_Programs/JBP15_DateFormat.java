package J01_Java_Basic_Programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JBP15_DateFormat {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("\nDefault Date Format : " + date);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\nDate Format : " + sdf.format(date));

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        System.out.println("\nDate-Time Format with AM/PM : " + sdf2.format(date));

    }
}