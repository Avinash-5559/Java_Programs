package Java_Basic_Programs;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Employee Name : ");
        String ename = sc.nextLine();

        System.out.print("\nEnter Employee ID : ");
        int eid = sc.nextInt();

        System.out.print("\nEnter Employee Address : ");
        String eadd = sc.nextLine();

        System.out.print("\nEnter Employee Phone No. : ");
        long eph = sc.nextLong();

        System.out.print("\nEnter Employee E-mail : ");
        String eem = sc.next();

        System.out.print("\nEnter Employee Designation : ");
        String edg = sc.next();

        System.out.println("\n------EMPLOYEE DETAILS------");
        System.out.println("Employee Name : "+ename);
        System.out.println("Employee ID : "+eid);
        System.out.println("Employee Address : "+eadd);
        System.out.println("Employee Phone No. : "+eph);
        System.out.println("Employee E-mail : "+eem);
        System.out.println("Employee Designation : "+edg);

    }
}
