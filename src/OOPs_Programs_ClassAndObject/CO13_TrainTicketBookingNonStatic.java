package OOPs_Programs_ClassAndObject;

public class CO13_TrainTicketBookingNonStatic {
    static String tname;
    static int tnum;
    String cname;
    String cberth;
    int cseatnum;

    static void trainInformation() {
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-= DETAILS OF TRAIN =-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Train Name   : " + tname);
        System.out.println("Train Number : " + tnum);
    }

    void bookTrainTicket() {

        System.out.println("\n==================== CUSTOMER DETAILS ====================");
        System.out.println("Customer Name        : " + cname);
        System.out.println("Customer Berth       : " + cberth);
        System.out.println("Customer Seat Number : " + cseatnum);
    }
}