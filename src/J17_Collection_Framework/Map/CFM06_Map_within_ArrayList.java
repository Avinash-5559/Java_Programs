package J17_Collection_Framework.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CFM06_Map_within_ArrayList {
    public static void main(String[] args) {

        System.out.println("\n--------------------------------- HashMap ---------------------------------\n");

        HashMap<String, String> student1 = new HashMap();

        student1.put("name", "pramod");
        student1.put("roll", "1");
        student1.put("phone", "96543210");

        System.out.println("HashMap Item 1 : " + student1);


        HashMap<String, String> student2 = new HashMap();

        student2.put("name", "amit");
        student2.put("roll", "2");
        student2.put("phone", "65432356");

        System.out.println("HashMap Item 2 : " + student2);

        /*
            OUTPUT :
                    --------------------------------- HashMap ---------------------------------

                    HashMap Item 1 : {phone=96543210, name=pramod, roll=1}
                    HashMap Item 2 : {phone=65432356, name=amit, roll=2}
        */

        System.out.println("\n--------------------------------- ArrayList ---------------------------------\n");

        List students = new ArrayList();

        students.add(student1);
        students.add(student2);

        System.out.println("List of Map Item : " + students);

        /*
          OUTPUT :
                    --------------------------------- ArrayList ---------------------------------

                    List of Map Item : [{phone=96543210, name=pramod, roll=1}, {phone=65432356, name=amit, roll=2}]
        */

        /*

            ---------------------------------------- NOTES ----------------------------------------

            List of Map (is quite similar to JSON)
            [{phone=96543210, name=pramod, roll=1}, {phone=65432356, name=amit, roll=2}]

            JSON
            [{"phone":96543210, "name":"pramod", "roll":1}, {"phone":65432356, "name":"amit", "roll":2}]

        */
    }
}