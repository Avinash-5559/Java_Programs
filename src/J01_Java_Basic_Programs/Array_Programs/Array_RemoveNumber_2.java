package J01_Java_Basic_Programs.Array_Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_RemoveNumber_2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("\nOrignial Array : " + Arrays.toString(list.toArray()));

        // Remove by Value
        list.remove(Integer.valueOf(30));

        // Remove by Index
        /*
            list.remove(1);
        */

        System.out.println("\nUpdated Array : " + Arrays.toString(list.toArray()));

    }
}