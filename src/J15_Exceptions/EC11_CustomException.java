package J15_Exceptions;

public class EC11_CustomException {
    public static void main(String[] args) {

        EC11_Bank sbi = new EC11_Bank("INR", 100);
        EC11_Bank icici = new EC11_Bank("INR", 123);

        int result1 = sbi.add(icici);
        System.out.println("Result 1 (INR & INR): " + result1);

        EC11_Bank jp_chase = new EC11_Bank("USD", 115);

        int result2 = sbi.add(jp_chase);
        System.out.println("Result 2 (INR & USD) : " + result2);

    }
}