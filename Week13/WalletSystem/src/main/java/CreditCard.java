public class CreditCard extends PaymentCard{

    private double availableCredit;
    private double interestCharge = 0.025;

    public CreditCard(long cardNumber, String expiry, int secNum, double availableCredit) {
        super(cardNumber, expiry, secNum);
        this.availableCredit = availableCredit;
    }

    public double getAvailableCredit() {
        return this.availableCredit;
    }
    private void setAvailableCredit(double newAvailableCredit){
        this.availableCredit = newAvailableCredit;
    }
    public void calculateNewAvailableCredit(double amountCharged){
        this.setAvailableCredit(this.getAvailableCredit() - amountCharged);
    }
    public void charge(double amountOfItem){
        double amountToCharge = amountOfItem * (1+interestCharge);
        this.calculateNewAvailableCredit(amountToCharge);
        logTransaction(String.valueOf(this.getCardNumber()), amountToCharge);
    }
}
