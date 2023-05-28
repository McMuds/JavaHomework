import java.util.HashMap;

public class ShoppingBasket {
    private HashMap<BasketItem, Integer> shoppingBasket;
    private Boolean loyaltyCustomer;

    public ShoppingBasket(Boolean loyaltyCustomer){
        this.shoppingBasket = new HashMap<BasketItem, Integer>();
        this.loyaltyCustomer = loyaltyCustomer;
    }

    public Boolean getLoyaltyCustomer() {
        return loyaltyCustomer;
    }

    public void setLoyaltyCustomer(Boolean loyaltyCustomer) {
        this.loyaltyCustomer = loyaltyCustomer;
    }

    public HashMap<BasketItem, Integer> getShoppingBasket() {
        return shoppingBasket;
    }
    public void setShoppingBasket(HashMap<BasketItem, Integer> shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }
    public void addItemToBasket(BasketItem newItem, Integer quantity){
        int currentCount;
        if ( this.shoppingBasket.containsKey(newItem)){
            currentCount = getQuantity(newItem);
            this.shoppingBasket.put(newItem, quantity + currentCount);
        } else {
            this.shoppingBasket.put(newItem, quantity);
        }
    }
    public Integer getQuantity(BasketItem itemInQuestion){
        if (this.shoppingBasket.containsKey(itemInQuestion)){
            return this.shoppingBasket.get(itemInQuestion);
        }
        return 0;
    }
    public void removeItemFromBasket(BasketItem oldItem, Integer quantity){
        int currentCount;
        if ( this.shoppingBasket.containsKey(oldItem)){
            currentCount = getQuantity(oldItem);
            if (currentCount <= quantity){
                this.shoppingBasket.remove(oldItem);
            } else {
                this.shoppingBasket.put(oldItem, currentCount - quantity);
            }
        }
    }
    public int countItems(){
        return this.shoppingBasket.size();
    }
    public void emptyBasket(){
        this.shoppingBasket.clear();
    }
    public Double calculateValue(){
        Double totalCost = 0.0;
        Double itemToCharge = 0.0;
        for (BasketItem item : this.shoppingBasket.keySet()){
            itemToCharge =  calculateBOGOFCount(item);
            totalCost += itemToCharge * item.getCostOfItem();
        }
        totalCost = overTwentyDiscount(totalCost);
        totalCost = loyaltyDiscount(totalCost);
        return totalCost;
    }
    public Double calculateBOGOFCount(BasketItem item){
        int itemCount;
        Double itemToCharge;
        itemCount = this.shoppingBasket.get(item);
        itemToCharge = (double) itemCount / 2;
        if (itemCount % 2 != 0){
            itemToCharge += 0.5;
        }
        return itemToCharge;
    }
    public Double overTwentyDiscount(Double previousTotal){
        if (previousTotal > 20.0){
            return previousTotal * 0.9;
        }
        return previousTotal;
    }
    public Double loyaltyDiscount(Double previousTotal){
        if (getLoyaltyCustomer()){
            previousTotal = previousTotal * .98;
        }
        return previousTotal;
    }
}
