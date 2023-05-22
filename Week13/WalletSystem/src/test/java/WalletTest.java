import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    GiftCard giftCard1;
    DebitCard debitCard;
    CreditCard creditCard;
    Wallet testWallet;

    @Before
    public void before(){
        giftCard1 = new GiftCard();
        giftCard1.addMoney(50.0);
        debitCard = new DebitCard(23123,"04/23", 213,
                123123, 123123);
        creditCard = new CreditCard(123123, "04/34", 234,
                9009.34);
        testWallet = new Wallet();
    }
    @Test
    public void canAddChargeableToWallet(){
        testWallet.addChargeableToWallet(giftCard1);
        assertEquals(1, testWallet.countCards());
    }
    @Test
    public void canAddChargeableToWallet_multiple(){
        testWallet.addChargeableToWallet(giftCard1);
        testWallet.addChargeableToWallet(creditCard);
        assertEquals(2, testWallet.countCards());
    }
    @Test
    public void canSetSelectCard(){
        testWallet.addChargeableToWallet(giftCard1);
        testWallet.setSelectedCard(0);
        assertEquals(giftCard1.getClass(), testWallet.getSelectedCard().getClass());
    }

    @Test
    public void canChargeGiftCard(){
        testWallet.addChargeableToWallet(giftCard1);
        testWallet.setSelectedCard(0);
        testWallet.pay( 22.0);
        assertEquals(28.0, giftCard1.getBalance(),0.009);

    }
    @Test
    public void canChargeCreditCard(){
        testWallet.addChargeableToWallet(creditCard);
        testWallet.setSelectedCard(0);
        testWallet.pay(200.0);
        assertEquals(8804.34, creditCard.getAvailableCredit(),0.009);
    }
    @Test
    public void canChargeDebitCard(){
        testWallet.addChargeableToWallet(debitCard);
        testWallet.setSelectedCard(0);
        testWallet.pay(200.0);
//        assertEquals(8804.34, creditCard.getAvailableCredit(),0.009);
    }
}
