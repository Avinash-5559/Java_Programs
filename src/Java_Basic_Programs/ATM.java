package Java_Basic_Programs;

public class ATM {
    public static void main(String[] args) {
        System.out.println("\n------Welcome to the ATM------");
        byte button=3;
        int amt=20000;
        int bal=50000;
        short pin=1234;
        if(pin==1234) {
            System.out.println("\nButton Clicked : " + button);
            switch (button) {
                case 1:
                    System.out.println("\nYour Amount Balance is Rs. " + bal);
                    break;
                case 2:
                    System.out.println("\nMini Statement");
                    break;
                case 3:
                    System.out.println("\n------MONEY WITHDRAW------");
                    int i = amt % 100;
                    if (i > 0) {
                        System.out.println("\nThis amount Rs. " + amt + " is not Multiple of 100");
                    } else if (amt <= bal) {
                        if ((amt >= 500) && (amt <= 25000)) {
                            System.out.println("\nYou Succfully Withdraw Your Amount Rs. " + amt);
                            System.out.println("\nPlease Collect Your Cash Rs. " + amt);
                        } else if ((amt < 500) || (amt >= 25000)) {
                            System.out.println("\nYour Amount Rs. " + amt + " is not in Between Rs. 500 to Rs. 25000");
                        }
                    } else {
                        System.out.println("Your Amount Balance is Insufficient");
                    }
                    break;
                default:
                    System.out.println("\nButton " + button + " is Not Exist");
            }
        }else{
            System.out.println("\nYou Entered Invalid Pin");
        }
        System.out.println("\nThank You Visit Again");
    }
}