import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;

    @Before
    public void before(){
        debitCard = new DebitCard(1234123412341239L, "04/25", 321,
                3482354, 834327);
    }

    @Test
    public void cardHasAccountNumber() {
        assertEquals(1234123412341239L, debitCard.getCardNumber());
    }
    @Test
    public void cardHasExpiryDate(){
        assertEquals("04/25", debitCard.getExpiryDate());
    }
    @Test
    public void cardHasSecurityNumber(){
        assertEquals(321, debitCard.getSecurityNumber());
    }
    @Test
    public void cardHasAccountNUmber(){
        assertEquals(3482354, debitCard.getAccountNumber());
    }
    @Test
    public void cardHasSortCode(){
        assertEquals(834327, debitCard.getSortCode());
    }

}
