import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftCard;
    @Before
    public void before(){
        giftCard = new GiftCard();
    }

    @Test
    public void canGetBalance(){
        assertEquals(0.0, giftCard.getBalance(), 0.0);
    }

    @Test
    public void canAddMoney(){
        giftCard.addMoney(15.00);
        assertEquals(15.0, giftCard.getBalance(),0.00);
    }
    @Test
    public void canCharge(){
        giftCard.addMoney(50.0);
        giftCard.charge(13.0);
        assertEquals(37.0, giftCard.getBalance(),0.009);
    }
}
