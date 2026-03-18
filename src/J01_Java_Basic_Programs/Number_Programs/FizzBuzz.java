package J01_Java_Basic_Programs.Number_Programs;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Multiple of 3 and 5         : " + "FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Multiple of 3               : " + "Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Multiple of 5               : " + "Buzz");
            } else {
                System.out.println("Not the multiple of 3 and 5 : " + i);
            }
        }
    }
}