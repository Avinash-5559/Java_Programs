package OOPs_Programs_Polymorphism;

//------------------------------ METHOD OVERRIDING ------------------------------
//                                      OR
//--------------------------- DYNAMIC METHOD DISPATCH ---------------------------

/*
    - Inheriting a method of Super Class, changing the implementation in the Sub Class is known as
      Method Overriding.
    - It is achieve in Run Time Polymorphism.
*/

public class PO03_Father {

    void home() {
        System.out.println("Father purchase 2 BHK");
    }

    void garden() {
        System.out.println("Father wants Garden");
    }
}
