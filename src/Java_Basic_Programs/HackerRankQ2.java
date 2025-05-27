package Java_Basic_Programs;

import java.util.Scanner;

public class HackerRankQ2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the length of Side 1 : ");
        double side1 = sc.nextDouble();

        System.out.print("\nEnter the length of Side 2 : ");
        double side2 = sc.nextDouble();

        System.out.print("\nEnter the length of Side 3 : ");
        double side3 = sc.nextDouble();

        String msg;

        if (side1<=0 || side2<=0 || side3<=0){
            msg="Invalid Inputs. Length of the triangle side must be in positive numbers";
        } else if (side1==side2 && side2==side3 && side1==side3){
            msg="It is an Equilateral Triangle";
        } else if (side1==side2 || side2==side3 || side1==side3) {
            msg="It is an Isosceles Triangle";
        }else {
            msg="It is a Scalene Triangle";
        }

        System.out.println("\nOutput : "+msg);

        sc.close();
    }
}
