package J1_Java_Basic_Programs;

public class Pattern13A {
    public static void main(String[] args) {

        int row=12;
        int str=1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int j = 0; j < str; j++) {
                System.out.print("*");
            }
            System.out.println();
            str++;
        }
    }
}

/*
    * *
    ** **
    *** ***
    **** ****
    ***** *****
    ****** ******
    ******* *******
    ******** ********
    ********* *********
    ********** **********
    *********** ***********
    ************ ************
*/