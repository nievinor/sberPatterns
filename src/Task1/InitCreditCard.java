package Task1;

import Task1.factory.DigitalCreditCardFactory;
import Task1.factory.GoldCreditCardsFactory;
import Task1.factory.PremiumCreditCardFactory;


public class InitCreditCard {

    public static CreditCardFactory createCreditCardFactory(CardTypes cardType) {
        switch (cardType) {
            case GOLD:
                return new GoldCreditCardsFactory();
            case PREMIUM:
                return new PremiumCreditCardFactory();
            case DIGITAL:
                return new DigitalCreditCardFactory();
            default:
                throw new RuntimeException("unknown credit card type");
        }
    }

}
