package J17_Collection_Framework.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class CFL08_Vector {
    public static void main(String[] args) {

        //---------- Vector is similar to ArrayList due to Thread Safe means operation are done One by One ----------

        Vector vector = new Vector();

        vector.add("Pramod");
        vector.add("Amit");
        vector.add("Lucky");

        System.out.println("Vector List Items               : " + vector);

        vector.remove("Amit");

        System.out.println("Does Vector contain this value  : " + vector.contains("Lucky"));
        System.out.println("Updated Vector List Items       : " + vector);

        /*
            OUTPUT :
                    Vector List Items               : [Pramod, Amit, Lucky]
                    Does Vector contain this value  : true
                    Updated Vector List Items       : [Pramod, Lucky]
        */

        System.out.println("\n-------------------- ITERATOR --------------------");

        Iterator iterator = vector.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*
            OUTPUT :
                    -------------------- VECTOR ITERATOR --------------------
                    Pramod
                    Lucky
        */

        System.out.println("\n-------------------- ENUMERATION --------------------");

        //-------------------- Enumeration is ONLY used in the Vector Class for iteration --------------------

        Enumeration enumeration = vector.elements();
        //Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        /*
            OUTPUT :
                    -------------------- ENUMERATION --------------------
                    Pramod
                    Lucky
        */

    }
}