package J17_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Scanner;

public class CFL06_ArrayList_Input {
    public static void main(String[] args) {

        // Multiple inputs from the user and store them in separate.
        // ArrayLists based on user-defined categories.

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        ArrayList<Integer> ages = new ArrayList<>();

        String continueInput = "Y";                                     // Control variable for input loop

        while (continueInput.equalsIgnoreCase("Y")) {

            System.out.print("\nEnter the Name : ");
            String name = sc.next();

            names.add(name);                                            // Add name to names list

            System.out.print("\nEnter the Age : ");
            int age = sc.nextInt();

            ages.add(age);                                              // Add age to ages list

            System.out.print("\nDo you want to Enter Another Record ? (Y/N) : ");
            continueInput = sc.next();

        }

        for (Object o1 : names) {
            System.out.println(o1);
        }

        for (Object o2 : ages) {
            System.out.println(o2);
        }

        sc.close();

    }
}