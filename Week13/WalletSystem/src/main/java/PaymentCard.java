public abstract class PaymentCard implements Chargeable{
    private long cardNumber;
    private String expiryDate;
    private int securityNumber;

    public PaymentCard(long cardNumber, String expiry, int secNum){
        this.cardNumber = cardNumber;
        this.expiryDate = expiry;
        this.securityNumber = secNum;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public String logTransaction(String identifier, double amount){
        String result = ("Transaction to pay £" + amount + " with account number " + identifier);
        System.out.println(result);
        return result;
    }
}
