package J2_OOPs_Programs_ClassAndObject;

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