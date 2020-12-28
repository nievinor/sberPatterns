package Task1;

public class Main {

    public static void main(String[] args) {

        CreditCardFactory goldCregitCardFactory = InitCreditCard.createCreditCardFactory(CardTypes.GOLD);
        CreditCard goldCard = goldCregitCardFactory.createCreditCard("Ivan", "Ivanov");
        goldCard.addBalance(500.0);
        goldCard.reduceBalance(300.0);
        System.out.println(goldCard.toString());

    }

}
