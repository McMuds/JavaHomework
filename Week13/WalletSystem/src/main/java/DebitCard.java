public class DebitCard extends PaymentCard{

    private int accountNumber;
    private int sortCode;


    public DebitCard(long cardNumber, String expiry, int secNum, int accNo, int sortCode) {
        super(cardNumber, expiry, secNum);
        this.accountNumber = accNo;
        this.sortCode = sortCode;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public int getSortCode() {
        return this.sortCode;
    }
    public void charge(double amountCharged){
        this.logTransaction(String.valueOf(this.accountNumber), amountCharged);
    }
}
