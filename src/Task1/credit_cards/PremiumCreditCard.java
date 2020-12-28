package Task1.credit_cards;

import Task1.CreditCard;

public class PremiumCreditCard extends CreditCard {
    public PremiumCreditCard(String firstName, String lastName) {
        super();
        super.firstName             = firstName;
        super.lastName              = lastName;
        super.creditLimit           = 600_000.0;
        super.costCardService       = 2450;
        super.interestFreePeriod    = 50;
        super.interestRate          = 23.9;
    }
}
