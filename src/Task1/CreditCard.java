package Task1;

public abstract class CreditCard {

    protected double creditLimit        = 0.0;
    protected double costCardService    = 0.0;
    protected double balance            = 0.0;
    protected int interestFreePeriod    = 0;
    protected double interestRate       = 0.0;
    protected String firstName          = "";
    protected String lastName           = "";
    protected long numberCard           = 0;

    public CreditCard() {
        numberCard = newCardNumber();
    }

    private static long newCardNumber() {
        long leftLimit  = 1000_0000_0000_0000L;
        long rightLimit = 9999_9999_9999_9999L;
        return leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
    }

    public void addBalance(Double sum) {
        if (sum > 0) balance += sum;
    }

    public void reduceBalance(double sum) {
        if (sum > 0 && sum <= balance) balance -= sum;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getCostCardService() {
        return costCardService;
    }

    public double getBalance() {
        return balance;
    }

    public int getInterestFreePeriod() {
        return interestFreePeriod;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getNumberCard() {
        return numberCard;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Владелец карты: " + getFullName() +
                "\n" +
                "Номер карты: " + getNumberCard() +
                "\n" +
                "Баланс: " + getBalance() +
                "\n" +
                "Кредитный лимит: " + getCreditLimit() +
                "\n" +
                "Обслуживание карты: " + getCostCardService() +
                "\n" +
                "Процентная ставка по любым операциям (годовых): " + getInterestRate() + "%" +
                "\n" +
                "Беспроцентный период на все покупки: до " + getInterestFreePeriod() + " дней" +
                "\n";
    }
}
