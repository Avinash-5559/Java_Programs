package J15_Exceptions;

public class EC11_Bank {

    private String currency;
    private Integer amount;

    public EC11_Bank(String currency, Integer amount) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(EC11_Bank bankName) {
        if (bankName.currency.equalsIgnoreCase("INR")) {
            return bankName.amount + this.amount;
        } else {
            try {
                throw new CustomException("Currency Mismatch, can't proceed!");
                // throw new Exception("Currency Mismatch, can't proceed!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
            return 0;
    }
}

class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}