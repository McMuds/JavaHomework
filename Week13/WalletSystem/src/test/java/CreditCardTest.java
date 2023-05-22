import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(1234123412341239L, "04/25", 321,
                3546.99);
    }

    @Test
    public void cardHasAccountNumber() {
        assertEquals(1234123412341239L, creditCard.getCardNumber());
    }
    @Test
    public void cardHasExpiryDate(){
        assertEquals("04/25", creditCard.getExpiryDate());
    }
    @Test
    public void cardHasSecurityNumber(){
        assertEquals(321, creditCard.getSecurityNumber());
    }
    @Test
    public void cardHasAvailableCredit(){
        assertEquals(3546.99, creditCard.getAvailableCredit(),0.009);
    }

}
