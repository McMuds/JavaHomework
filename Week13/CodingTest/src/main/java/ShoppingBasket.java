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
        return this.shoppingBasket.get(itemInQuestion);
    }
    public void removeItemToBasket(BasketItem oldItem, Integer quantity){
        int currentCount;
        if ( this.shoppingBasket.containsKey(oldItem)){
            currentCount = getQuantity(oldItem);
            if (currentCount <= quantity){
                this.shoppingBasket.remove(oldItem);
            }
            this.shoppingBasket.put(oldItem, quantity - currentCount);
        }
    }

}
