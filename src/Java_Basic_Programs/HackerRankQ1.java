package Java_Basic_Programs;

import java.util.Scanner;

public class HackerRankQ1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Score : ");
        int score = sc.nextInt();
        char grade='O';

        if (score>=90 && score<=100){
            grade='A';
        } else if (score>=80 && score<=89) {
            grade='B';
        } else if (score>=70 && score<=79) {
            grade='C';
        } else if (score>=60 && score<=69) {
            grade='D';
        } else if (score>=50 && score<=59) {
            grade='E';
        } else if (score<=0 || score>100) {
            System.out.println("LOL! Seriously you are a God Level.");
        }
        else {
            grade='F';
        }
        System.out.println("Your Grade is "+grade);

        sc.close();
    }
}
