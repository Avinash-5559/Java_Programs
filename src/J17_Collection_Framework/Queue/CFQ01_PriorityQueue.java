package J17_Collection_Framework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class CFQ01_PriorityQueue {
    public static void main(String[] args) {

        /*
            -> Queue is the FIFO (First In First Out) type of mechanism.
            -> Some Extra Methods present on Queue such as :
                 - offer [Same like as add()]
                 - peek  [See the First element (FIFO element) which want to remove]
                 - poll  [Same like as delete()]
        */

        Queue queue1 = new PriorityQueue();

        queue1.add("Pramod");
        queue1.add("Dutta");
        queue1.add("Dutta");
        //queue1.add(4566123);                   // java.lang.ClassCastException
        //queue1.add(null);                      // java.lang.NullPointerException
        queue1.add("Amit");
        queue1.add("Sharma");

        System.out.println("Queue Items                             : " + queue1);
        System.out.println("See First Element of the Queue          : " + queue1.peek());
        System.out.println("Delete the First Element of the Queue   : " + queue1.poll());
        System.out.println("Updated Queue Items                     : " + queue1);

        System.out.println("\n------------------------------------------------------------------------------\n");

        PriorityQueue queue2 = new PriorityQueue();

        queue2.add(468956);
        queue2.add(79531653);
        queue2.add(265656);
        queue2.add(468956);
        //queue2.add("Pramod");                  // java.lang.ClassCastException

        System.out.println("Queue Items                             : " + queue2);
        System.out.println("See First Element of the Queue          : " + queue2.peek());
        System.out.println("Delete the First Element of the Queue   : " + queue2.poll());
        System.out.println("Updated Queue Items                     : " + queue2);

        /*
          OUTPUT :

            Queue Items                             : [Amit, Dutta, Dutta, Pramod, Sharma]
            See First Element of the Queue          : Amit
            Delete the First Element of the Queue   : Amit
            Updated Queue Items                     : [Dutta, Pramod, Dutta, Sharma]

            ------------------------------------------------------------------------------

            Queue Items                             : [265656, 468956, 468956, 79531653]
            See First Element of the Queue          : 265656
            Delete the First Element of the Queue   : 265656
            Updated Queue Items                     : [468956, 79531653, 468956]

        */
    }
}