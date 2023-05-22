import java.util.ArrayList;

public class Wallet {

    private ArrayList<Chargeable> cards;
    private Chargeable selectedCard;

    public Wallet(){
        this.cards = new ArrayList<>();
        this.selectedCard = null;
    }
    public void addChargeableToWallet(Chargeable newCard){
        this.cards.add(newCard);
    }
    public Chargeable getSelectedCard(){
        return this.selectedCard;
    }
    public void setSelectedCard(int chargeableIndex){
        this.selectedCard = this.cards.get(chargeableIndex);
    }
    public int countCards() {
        return this.cards.size();
    }
    public void pay (double amount){
        this.selectedCard.charge(amount);
    }
}
