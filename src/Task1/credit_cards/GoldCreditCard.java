package Task1.credit_cards;

import Task1.CreditCard;

public class GoldCreditCard extends CreditCard {
    public GoldCreditCard(String firstName, String lastName) {
        super();
        super.firstName             = firstName;
        super.lastName              = lastName;
        super.creditLimit           = 600_000.0;
        super.costCardService       = 0;
        super.interestFreePeriod    = 50;
        super.interestRate          = 25.9;
    }
}
