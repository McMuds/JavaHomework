import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaymentCardTest {

    @Test
    public void canLogTransaction(){
        CreditCard creditCard = new CreditCard(123, null, 123,
                300.00);
        assertEquals("Transaction to pay £12.33 with account number 1239",
                creditCard.logTransaction("1239",12.33));
    }
}
