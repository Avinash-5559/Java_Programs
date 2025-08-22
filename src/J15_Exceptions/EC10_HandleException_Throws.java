package J15_Exceptions;

// --------------- Mostly prefer "try / catch" & "try / catch / finally" instead of "throws" ---------------

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EC10_HandleException_Throws {
    public static void main(String[] args) throws Exception {
         // public static void main(String[] args) throws FileNotFoundException, Exception {

        FileInputStream fileInputStream = new FileInputStream("C:log.txt");
    }
}