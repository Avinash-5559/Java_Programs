/*
    Class:  A class is a blueprint or template used for creating objects.
            It defines the structure, including the variables (attributes) and methods (behaviors).
    Object: An object is the real-world entity which is created from that blueprint using the new keyword.
            It has actual values and can perform actions.
                                                      OR
            An object which are accesses and the uses of instance variables and methods
            which are defined by its class.
*/

package J02_OOPs_Programs_ClassAndObject;

public class CO3_Laptop {

    //-------------------------------------- ATTRIBUTES --------------------------------------
    //                                          OR
    //------------------------ MEMBER VARIABLES or INSTANCE VARIABLES ------------------------

    String name;
    double price;
    String color;

    //-------------------------------------- BEHAVIOURS --------------------------------------
    //                                          OR
    //-------------------------- MEMBER METHODS or INSTANCE METHODS --------------------------

    void brand() {
        System.out.println("========= DETAILS OF LAPTOP ==========");

        System.out.println("Name : " + name);

    }

    void details() {

        System.out.println("Price : " + price);
        System.out.println("Color : " + color);

    }

}