package J15_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EC10_Checked_Throws {
    public static void main(String[] args) throws Exception {
        //public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("C:log.txt");
    }
}