package Task1.factory;

import Task1.CreditCard;
import Task1.CreditCardFactory;
import Task1.credit_cards.GoldCreditCard;

public class GoldCreditCardsFactory implements CreditCardFactory {

    @Override
    public CreditCard createCreditCard(String firstName, String lastName) {
        return new GoldCreditCard(firstName, lastName);
    }
}
