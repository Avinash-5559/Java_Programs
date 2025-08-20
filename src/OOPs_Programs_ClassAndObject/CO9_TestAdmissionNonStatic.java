package OOPs_Programs_ClassAndObject;

public class CO9_TestAdmissionNonStatic {
    public static void main(String[] args) {

        CO9_AdmissionNonStatic.sname = "Delhi Public School";
        CO9_AdmissionNonStatic.sadd = "Bose Nagar, Delhi, India";
        CO9_AdmissionNonStatic.sphone = 8856422222L;

        CO9_AdmissionNonStatic.schoolDetail();

        CO9_AdmissionNonStatic stu1 = new CO9_AdmissionNonStatic();
        stu1.name = "Sameer Khanna";
        stu1.regid = "Stu01";
        stu1.gen = "Male";
        stu1.phone = 9564254615L;
        stu1.email = "khanna.06sameer@gmail.com";

        CO9_AdmissionNonStatic stu2 = new CO9_AdmissionNonStatic();
        stu2.name = "Rupali Singh";
        stu2.regid = "Stu02";
        stu2.gen = "Female";
        stu2.phone = 9566654615L;
        stu2.email = "rupalisingh97@gmail.com";

        CO9_AdmissionNonStatic stu3 = new CO9_AdmissionNonStatic();
        stu3.name = "Manoj Kumar";
        stu3.regid = "Stu03";
        stu3.gen = "Male";
        stu3.phone = 6425554615L;
        stu3.email = "manojkumar14@hotmail.com";

        stu1.studentRegistration();
        stu2.studentRegistration();
        stu3.studentRegistration();

    }
}