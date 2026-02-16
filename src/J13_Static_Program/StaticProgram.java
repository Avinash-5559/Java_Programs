package J13_Static_Program;

//---------------------------------------- MAIN PROGRAM ----------------------------------------

public class StaticProgram {
    public static void main(String[] args) {

        A a1 = new A();                                     // Load the class and object creation

        /*
        -> If ARGUMENT is not passing on the object then calling NON-PARAMETERIZED Constructor.

        A a2 = new A();

        -> If ARGUMENT is passing on the object then calling PARAMETERIZED Constructor.

        A a3 = new A("JUNE");

        */

        A.m1();
        a1.m2();

        System.out.println(A.course_name);                  // STATIC VARIABLE call via CLASS NAME

        // System.out.println(a1.course_name);              // STATIC VARIABLE also call via REFERENCE VARIABLE

    }
}

class A {

    //---------------------------------------- STATIC VARIABLE ----------------------------------------

    static String course_name = "ATB10x";

    //-------------------------------------- NON-STATIC VARIABLE --------------------------------------

    String month;
    int year;

    //---------------------------------------- STATIC BLOCK ----------------------------------------

    static {
        System.out.println("During class load, STATIC BLOCK will execute first.");

        // System.out.println(year);                        // In STATIC BLOCK can't access the NON-STATIC VARIABLES
    }

    //---------------------------------------- NON-STATIC BLOCK ----------------------------------------

    {
        System.out.println("During class load, NON-STATIC BLOCK will execute after STATIC BLOCK.");

        // System.out.println(course_name);                 // In NON-STATIC BLOCK can access the STATIC VARIABLES
    }

    //------------------ DEFAULT CONSTRUCTOR - It is always NON-STATIC and NON-PARAMETERIZED ------------------

    // Since we are defining other constructors below, the default constructor won't be provided automatically.

    /*

    A() {
        System.out.println("Once object is create, DEFAULT CONSTRUCTOR will call after BLOCKS.");
    }

    */

    //------------------------------ USER DEFINED CONSTRUCTOR (WITHOUT PARAMETER) ------------------------------

    A() {
        this.month = "Unknown";
        System.out.println("It is NON-PARAMETERIZED Constructor");
    }

    //------------------------------ USER DEFINED CONSTRUCTOR (WITH PARAMETER) ------------------------------

    A(String month_c) {
        this.month = month_c;
        System.out.println("It is PARAMETERIZED Constructor");

    }

    //---------------------------------------- STATIC METHOD ----------------------------------------

    static void m1() {
        System.out.println("It is a STATIC METHOD.");

        // System.out.println(year);                        // In STATIC METHOD can't access the NON-STATIC VARIABLES
    }

    //---------------------------------------- NON-STATIC METHOD ----------------------------------------

    void m2() {
        System.out.println("It is a NON-STATIC METHOD.");

        // System.out.println(course_name);                 // In NON-STATIC METHOD can access the STATIC VARIABLES
    }

    //------------------------------ STATIC CLASS - It is not useful in Automation  ------------------------------

   /*
   static class B {

   }
   */

}