package J17_Collection_Framework.List;

/*
        Collection - It is an Interface in JAVA.

        Collections - It is a Class in JAVA (that contains complete methods which List, Set, Queue may require)
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CFL04_ArrayList3 {
    public static void main(String[] args) {

        List marks = new ArrayList();

        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println("ArrayList Items : " + marks);

        /*
            OUTPUT :
                    ArrayList Items : [91, 95, 56, 89]
        */

        Collections.reverse(marks);
        System.out.println("ArrayList Items by Collections in Reverse Order : " + marks);

        /*

            OUTPUT :
                    ArrayList Items by Collections in Reverse Order : [89, 56, 95, 91]
        */

        Collections.sort(marks);
        System.out.println("ArrayList Items by Collections : " + marks);

        /*
            OUTPUT :
                    ArrayList Items by Collections : [56, 89, 91, 95]
        */

        Collections.reverse(marks);
        System.out.println("ArrayList Items by Collections in Reverse Order : " + marks);

        /*
            OUTPUT :
                    ArrayList Items by Collections in Reverse Order : [95, 91, 89, 56]
        */

        Collections.sort(marks, Collections.reverseOrder());
        System.out.println("ArrayList Items by Collections in Reverse Order : " + marks);

        /*
            OUTPUT :
                    ArrayList Items by Collections in Reverse Order : [95, 91, 89, 56]
        */

    }
}