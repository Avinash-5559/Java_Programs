package J02_OOPs_Programs_ClassAndObject;

public class CO4_College {

    static String cName;
    static String cAddress;
    static long cPhone;
    String sId;
    String sName;
    String sGen;
    long sPhone;
    String sEmail;

    void details() {

        System.out.println("===================== STUDENT DETAILS ======================");

        System.out.println("College Name            : " + cName);
        System.out.println("College Address 	    : " + cAddress);
        System.out.println("College Phone Number 	: " + cPhone);
        System.out.println("Student ID 		        : " + sId);
        System.out.println("Student Name 		    : " + sName);
        System.out.println("Student Gender 		    : " + sGen);
        System.out.println("Student Phone Number 	: " + sPhone);
        System.out.println("Student E-mail 		    : " + sEmail);
    }
}