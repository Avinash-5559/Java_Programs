package J3_OOPs_Programs_Inheritance;

//------------------------------ HIERARCHICAL INHERITANCE ------------------------------

public class IN03_T_Program {
    public static void main(String[] args) {

        System.out.println("\n--------------- SON 1 CALLING ---------------");

        IN03_Son_1 s1 = new IN03_Son_1();

        s1.bhk4();

        s1.bhk1();

        System.out.println("\n--------------- SON 2 CALLING ---------------");

        IN03_Son_2 s2 = new IN03_Son_2();

        s2.bhk4();

        s2.bhk2();

        System.out.println("\n--------------- SON 3 CALLING ---------------");

        IN03_Son_3 s3 = new IN03_Son_3();

        s3.bhk4();

        s3.bhk3();

    }
}