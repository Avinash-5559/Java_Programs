package J2_OOPs_Programs_ClassAndObject;

public class CO3_Ecom {
    public static void main(String[] args) {

        CO3_Laptop l1 = new CO3_Laptop();
        l1.name = "HP";
        l1.price = 49999.99;
        l1.color = "Navy Blue";

        CO3_Laptop l2 = new CO3_Laptop();
        l2.name = "ASUS";
        l2.price = 54999.99;
        l2.color = "Metallic Grey";

        CO3_Laptop l3 = new CO3_Laptop();
        l3.name = "LENOVO";
        l3.price = 59999.99;
        l3.color = "Pitch Black";

        System.out.println();
        l1.brand();
        l1.details();

        System.out.println();
        l2.brand();
        l2.details();

        System.out.println();
        l3.brand();
        l3.details();

    }
}