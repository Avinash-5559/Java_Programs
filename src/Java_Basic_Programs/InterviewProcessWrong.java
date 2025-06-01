package Java_Basic_Programs;

public class InterviewProcessWrong {
    public static void main(String[] args) {
        byte per = 65, apti = 60, score = 80;
        short yop = 2015;
        if ((yop >= 2019 && yop <= 2021) && (per >= 60 && per <= 100)) {
            System.out.println("\nEligible for interview");
        } else {
            System.out.println("\nNot eligible for interview");
        }

        if (apti >= 50) {
            System.out.println("\n------APTITUDE ROUND------");
            if ((apti >= 50 && apti <= 100)) {
                System.out.println("\nYou clear your Aptitude");
            } else {
                System.out.println("\nYou didn't clear Aptitude Round. Better Luck next time");
            }
        }

        System.out.println("\n-----TECHNICAL ROUND------");
        if (score >= 60 && score < 70) {
            System.out.println("\nYou are hiring for Supporting");
        } else if (score >= 70 && score < 80) {
            System.out.println("\nYou are hiring for the Selenium ");
        } else if (score >= 80 && score <= 100) {
            System.out.println("\nYou are hiring for the Development");
        } else {
            System.out.println("\nSorry. You didn't clear Technical.Please try Again next time");
        }
    }
}