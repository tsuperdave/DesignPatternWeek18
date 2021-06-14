
public class AmericanExpress extends CreditCard {

    public AmericanExpress(String[] cardInfo) {
        super(cardInfo);
    }

    String cardNumber = cardInfo[0];

    @Override
    String validateCard(String cardNumber) {
        return null;
    }
}
