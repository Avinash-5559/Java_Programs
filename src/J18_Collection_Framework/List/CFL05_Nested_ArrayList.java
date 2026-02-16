package J18_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class CFL05_Nested_ArrayList {
    public static void main(String[] args) {

        /*
            List<Integer> list = new ArrayList<>();
            list.add(123456);
            list.add("Integer");                    This is not supported because List used as Integer Value
        */

        System.out.println("\n--------------- NORMAL ARRAYLIST 1 ---------------");

        List<String> fruits1 = new ArrayList<>();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        System.out.println("\nList of Fruits 1 : " + fruits1);

        /*
            OUTPUT :
                    --------------- NORMAL ARRAYLIST 1 ---------------

                    List of Fruits 1 : [orange, apple, cherry]
        */

        System.out.println("\n--------------- NORMAL ARRAYLIST 2 ---------------");

        List fruits2 = new ArrayList();
        fruits2.add("mango");
        fruits2.add("grapes");
        fruits2.add("papaya");
        System.out.println("\nList of Fruits 2 : " + fruits2);

        /*
            OUTPUT :
                    --------------- NORMAL ARRAYLIST 2 ---------------

                    List of Fruits 2 : [mango, grapes, papaya]
        */

        System.out.println("\n--------------- NORMAL ARRAYLIST 3 ---------------");

        List vegetables = new ArrayList<>();
        vegetables.add("tomato");
        vegetables.add("potato");
        vegetables.add("onion");
        System.out.println("\nList of Vegetables : " + vegetables);

        /*
            OUTPUT :
                    --------------- NORMAL ARRAYLIST 3 ---------------

                    List of Vegetables : [tomato, potato, onion]
        */

        System.out.println("\n--------------- NESTED ARRAYLIST ---------------");

        List allThings = new ArrayList<>();
        allThings.add(fruits1);
        allThings.add(fruits2);
        allThings.add(vegetables);
        System.out.println("\nAll the Things on the List : " + allThings);

        System.out.println("\nPick One the Particular Inder Value : " + allThings.get(1));

        /*
            OUTPUT :
                    --------------- NESTED ARRAYLIST ---------------

                    All the Things on the List : [[orange, apple, cherry], [mango, grapes, papaya], [tomato, potato, onion]]

                    Pick the Particular Inder Value : [mango, grapes, papaya]
        */

    }
}