package J1_Java_Basic_Programs;

public class OddAndEven {
    public static void main(String[] args) {

        System.out.print("\nEven Number : ");
        for (int i = 1; i <=100 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.print("\nOdd Number : ");
        for (int i = 1; i <=100 ; i++) {
            if(i%2 != 0){
                System.out.print(i+" ");
            }
        }

    }
}
