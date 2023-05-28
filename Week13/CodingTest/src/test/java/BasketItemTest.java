import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketItemTest {
    @Test
    public void canGetCost(){
        assertEquals(10.99, BasketItem.WINE.getCostOfItem(), 0.009);
    }
    @Test
    public void canGetName(){
        assertEquals("Wine", BasketItem.WINE.getNameOfItem());
    }
    @Test
    public void canGetCategory(){
        assertEquals(Category.FROZEN, BasketItem.MAGNUMS.getCategoryOfItem());
    }
}
