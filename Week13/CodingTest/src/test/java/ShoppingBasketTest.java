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
        assertEquals(1, loyaltyShoppingBasket.countItems(), 0);
    }
  @Test
    public void canAddToBasket_More(){
        loyaltyShoppingBasket.addItemToBasket(BasketItem.WINE, 1);
        assertEquals(3, loyaltyShoppingBasket.getQuantity(BasketItem.WINE), 0);
    }

    @Test
    public void canRemoveFromBasket(){
        loyaltyShoppingBasket.removeItemFromBasket(BasketItem.WINE, 2);
        assertEquals(0, loyaltyShoppingBasket.countItems(), 0);
    }
    @Test
    public void canRemoveFromBasket_FewerItems(){
        loyaltyShoppingBasket.removeItemFromBasket(BasketItem.WINE, 1);
        assertEquals(1, loyaltyShoppingBasket.getQuantity(BasketItem.WINE), 0);
    }
    @Test
    public void canRemoveFromBasket_MoreItems(){
        loyaltyShoppingBasket.removeItemFromBasket(BasketItem.WINE, 5);
        assertEquals(0, loyaltyShoppingBasket.getQuantity(BasketItem.WINE), 0);
    }
    @Test
    public void canRemoveFromBasket_NoItems(){
        loyaltyShoppingBasket.removeItemFromBasket(BasketItem.BEER, 5);
        assertEquals(0, loyaltyShoppingBasket.getQuantity(BasketItem.BEER), 0);
    }

    @Test
    public void canEmptyBasket(){
        loyaltyShoppingBasket.addItemToBasket(BasketItem.MAGNUMS, 1);
        loyaltyShoppingBasket.addItemToBasket(BasketItem.BEER, 10);
        loyaltyShoppingBasket.emptyBasket();
        assertEquals(0,loyaltyShoppingBasket.countItems());
    }

    @Test
    public void canCalculateBasketTotal_NoDiscounts(){
        unLoyalShoppingBasket.addItemToBasket(BasketItem.MAGNUMS, 1);
        unLoyalShoppingBasket.addItemToBasket(BasketItem.BEER, 1);
        unLoyalShoppingBasket.addItemToBasket(BasketItem.BREAD, 1);
        unLoyalShoppingBasket.addItemToBasket(BasketItem.EGGS, 1);
        assertEquals(14.45, unLoyalShoppingBasket.calculateValue(), 0);
    }
    @Test
    public void canApplyBOGOFDiscount_Even(){
        assertEquals(10.77, loyaltyShoppingBasket.calculateValue(), 0.009);
    }
    @Test
    public void canApplyBOGOFDiscount_Odd(){
        unLoyalShoppingBasket.addItemToBasket(BasketItem.BEER, 3);
        assertEquals(12.0, unLoyalShoppingBasket.calculateValue(), 0.0);
    }
    @Test
    public void canApplyBigSpenderDiscount(){
        loyaltyShoppingBasket.addItemToBasket(BasketItem.WINE,2);
        assertEquals(19.38, loyaltyShoppingBasket.calculateValue(),0.09);
    }
    @Test
    public void canApplyLoyaltyDiscount_noBigSpender(){
        assertEquals(10.77, loyaltyShoppingBasket.calculateValue(),0.09);
    }
}
