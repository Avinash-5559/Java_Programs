package OOPs_Programs_ClassAndObject;

public class CO13_TestTrainTicketBookingNonStatic {
    public static void main(String[] args) {

        CO13_TrainTicketBookingNonStatic.tname = "Delhi-Mumbai Rajdhani Express";
        CO13_TrainTicketBookingNonStatic.tnum = 12045;

        CO13_TrainTicketBookingNonStatic.trainInformation();

        CO13_TrainTicketBookingNonStatic ttbns1 = new CO13_TrainTicketBookingNonStatic();
        ttbns1.cname = "Parveen Kumar";
        ttbns1.cberth = "Lower Berth";
        ttbns1.cseatnum = 4;

        CO13_TrainTicketBookingNonStatic ttbns2 = new CO13_TrainTicketBookingNonStatic();
        ttbns2.cname = "Sunil Kumar Tyagi";
        ttbns2.cberth = "Upper Berth";
        ttbns2.cseatnum = 30;

        CO13_TrainTicketBookingNonStatic ttbns3 = new CO13_TrainTicketBookingNonStatic();
        ttbns3.cname = "Poonam Sharma";
        ttbns3.cberth = "Side Upper Berth";
        ttbns3.cseatnum = 56;

        ttbns1.bookTrainTicket();
        ttbns2.bookTrainTicket();
        ttbns3.bookTrainTicket();
    }
}