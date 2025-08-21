package J2_OOPs_Programs_ClassAndObject;

public class CO7_Substraction {

    int a;
    int b;
    int c;

    int subtract() {

        if ((a < 0) && (b < 0)) {
            c = a - b;
        } else if ((a < 0) || (b < 0)) {
            c = a - b;
        } else {
            c = a - b;
        }
        return c;
    }
}