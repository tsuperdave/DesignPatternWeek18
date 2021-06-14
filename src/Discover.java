public class Discover extends CreditCard {

    public Discover(String[] cardInfo) {
        super(cardInfo);
    }

    String cardNumber = cardInfo[0];

    @Override
    String validateCard(String cardNumber) {
        return null;
    }
}
