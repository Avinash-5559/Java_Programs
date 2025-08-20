package OOPs_Programs_ClassAndObject;

public class CO6_Addition {
    int a;
    int b;
    int c;

    int sum() {

        if ((a < 0) && (b < 0)) {
            c = a + b;
        } else if ((a < 0) || (b < 0)) {
            c = a + b;
        } else {
            c = a + b;
        }
        return c;
    }
}