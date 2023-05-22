public class GiftCard implements Chargeable{
    private double balance;

    public GiftCard(){
        this.balance = 0;
    }

    public double getBalance(){
        return this.balance;
    }
    private void setBalance(double newBalance){
        this.balance = newBalance;
    }
    public void addMoney(double moneyToAdd){
        setBalance(this.balance + moneyToAdd);
    }
    private void removeMoney(double moneyToRemove){
        setBalance(this.balance - moneyToRemove);
    }
    public void charge(double amountToCharge){
        this.removeMoney(amountToCharge);
    }
}
