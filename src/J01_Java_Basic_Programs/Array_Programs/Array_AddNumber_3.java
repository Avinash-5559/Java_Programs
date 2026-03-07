package J01_Java_Basic_Programs.Array_Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_AddNumber_3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("\nOriginal Array : " + Arrays.toString(list.toArray()));

        list.add(1, 50);

        System.out.println("\nUpdated Array : " + Arrays.toString(list.toArray()));

    }
}
