public class Visa extends CreditCard {

    public Visa(String[] cardInfo) {
        super(cardInfo);
    }

    String cardNumber = cardInfo[0];

    @Override
    String validateCard(String cardNumber) {
        return null;
    }
}
