package J2_OOPs_Programs_ClassAndObject;

public class CO5_Employee {

        String empid;
        String fname;
        String lname;
        int dd;
        int mm;
        int yyyy;
        String gen;
        String add;
        long phone;
        String email;

        void details(){

            System.out.println("\n=============== FULL DETAILS OF THE EMPLOYEE  ===============");
            System.out.println("Employee ID 	: "+empid);
            System.out.println("Employee Name 	: "+fname+" "+lname);
            System.out.println("D.O.B. 		    : "+dd+"/"+mm+"/"+yyyy);
            System.out.println("Gender 		    : "+gen);
            System.out.println("Address 	    : "+add);
            System.out.println("Phone No. 	    : "+phone);
            System.out.println("E-mail 		    : "+email);
        }
}