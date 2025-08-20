package OOPs_Programs_ClassAndObject;

public class CO02_Practice2 {
    public static void main(String[] args) {

        Mobile iphone = new Mobile("Iphone", "2007");
        System.out.println(iphone.model_name);
        System.out.println(iphone.year_of_launch);

        Mobile oneplus = new Mobile("OnePlus", "2015");
        System.out.println(oneplus.model_name);
        System.out.println(oneplus.year_of_launch);

        Mobile samsung = new Mobile("Samsung Galaxy S25 Ultra", "2025");
        System.out.println(samsung.model_name);
        System.out.println(samsung.year_of_launch);

        System.out.println("--------------------------------------------------------------------");

        iphone.display();
        oneplus.display();
        samsung.display();

        System.out.println("--------------------------------------------------------------------");

        String iphone_model = iphone.give_me_model_name();
        System.out.println(iphone_model);

        String oneplus_mpdel = oneplus.give_me_model_name();
        System.out.println(oneplus_mpdel);

        String samsung_model = samsung.give_me_model_name();
        System.out.println(samsung_model);

    }
}

class Mobile {

    //-------------------------------------- ATTRIBUTES --------------------------------------
    //                                          OR
    //------------------------ MEMBER VARIABLES or INSTANCE VARIABLES ------------------------

    String model_name;
    String year_of_launch;

    //------------------------- PARAMETERIZED CONSTRUCTOR -------------------------

    Mobile(String model_name_c, String year_of_launch_c) {
        this.model_name = model_name_c;
        this.year_of_launch = year_of_launch_c;
    }


    //-------------------------------------- BEHAVIOURS --------------------------------------
    //                                          OR
    //-------------------------- MEMBER METHODS or INSTANCE METHODS --------------------------


    //------------------------- VOID RETURN TYPE METHOD -------------------------

    void display() {
        System.out.println(this.model_name + " - " + this.year_of_launch);
    }

    //------------------------- NON-VOID RETURN TYPE METHOD -------------------------

    String give_me_model_name() {
        return this.model_name;
    }
}