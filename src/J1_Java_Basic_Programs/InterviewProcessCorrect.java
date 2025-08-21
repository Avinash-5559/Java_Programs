package J1_Java_Basic_Programs;

public class InterviewProcessCorrect {
    public static void main(String[] args) {
        short yop = 2020;
        byte per = 70;
        byte apti = 70, score = 60;
        System.out.println("\n------WELCOME FOR THE INTERVIEW PROCESS------");

        if (yop >= 2019 && yop <= 2021) {
            System.out.println("\nYour YOP is Eligible for Interview");

            if (per >= 60 && per <= 100) {
                System.out.println("\nYou Percentage is eligible for Interview.");
                System.out.println("\nNow You go to the Aptitude Round");

                System.out.println("\n------APTITUDE ROUND------");

                if (apti >= 50 && apti <= 100) {
                    System.out.println("\nYou Qualify Your Aptitude Round");
                    System.out.println("\nNow you go for Technical Round");

                    System.out.println("\n------TECHNICAL ROUND------");

                    if (score >= 60 && score < 70) {
                        System.out.println("\nYou are hiring for Supporting");

                    } else if (score >= 70 && score < 80) {
                        System.out.println("\nYou are hiring for the Selenium");

                    } else if (score >= 80 && score <= 100) {
                        System.out.println("\nYou are hiring for the Development");

                    } else {
                        System.out.println("\nSorry. You didn't clear Technical Round. Please try Again Next Time");
                    }
                } else {
                    System.out.println("\nYou didn't clear Aptitude Round. Please try Again Next Time");
                }
            } else {
                System.out.println("\nYour Percentage is not eligible for interview");
            }
        } else {
            System.out.println("\nYour YOP is not Eligible for the Interview");
        }
    }
}