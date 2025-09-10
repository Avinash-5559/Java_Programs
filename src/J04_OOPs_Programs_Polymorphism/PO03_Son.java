package J04_OOPs_Programs_Polymorphism;

//------------------------------ METHOD OVERRIDING ------------------------------
//                                      OR
//--------------------------- DYNAMIC METHOD DISPATCH ---------------------------

/*
    - Inheriting a method of Super Class, changing the implementation in the Sub Class is known as
      Method Overriding.
    - It is achieving in Run Time Polymorphism.
*/

public class PO03_Son extends PO03_Father {

    @Override
    void home() {
        System.out.println("Son purchase 3 BHK");
    }

    void pool() {
        System.out.println("Son wants Swimming Pool");
    }
}
