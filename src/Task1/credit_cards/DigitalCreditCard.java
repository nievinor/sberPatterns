package Task1.credit_cards;

import Task1.CreditCard;

public class DigitalCreditCard extends CreditCard {
    public DigitalCreditCard(String firstName, String lastName) {
        super();
        super.firstName             = firstName;
        super.lastName              = lastName;
        super.creditLimit           = 600_000.0;
        super.costCardService       = 0;
        super.interestFreePeriod    = 0;
        super.interestRate          = 23.9;
    }
}
