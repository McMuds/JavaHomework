import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    private ShoppingBasket loyaltyShoppingBasket;
    private ShoppingBasket unLoyalShoppingBasket;

    @Before
    public void before(){
        loyaltyShoppingBasket = new ShoppingBasket(true);
        unLoyalShoppingBasket = new ShoppingBasket(false);
        loyaltyShoppingBasket.addItemToBasket(BasketItem.WINE, 2);
    }

    @Test
    public void canAddToBasket(){
        assertEquals(2, loyaltyShoppingBasket.getQuantity(BasketItem.WINE), 0);
    }

    @Test
    public void canRemoveFromBasket(){
        loyaltyShoppingBasket.removeItemToBasket(BasketItem.WINE, 2);
    }
}
