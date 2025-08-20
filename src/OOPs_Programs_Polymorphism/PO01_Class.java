package OOPs_Programs_Polymorphism;

//------------------------------ METHOD OVERLOADING ------------------------------

/*
    - When declaring multiple methods on the Same Class with Same Name but different parameters
      is known as Method Overloading.
    - It is achieve in Compile Time Polymorphism.
*/

public class PO01_Class {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}