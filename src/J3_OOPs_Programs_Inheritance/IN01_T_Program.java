package J3_OOPs_Programs_Inheritance;

//------------------------------ SINGLE INHERITANCE ------------------------------

public class IN01_T_Program {
    public static void main(String[] args) {

        System.out.println("\n--------------- SON CALLING ---------------");

        IN01_Son s1 = new IN01_Son();

        System.out.println("Father Gold : " + s1.gold_father + " gm");

        s1.bhk2();

        s1.bhk3();

    }
}