
public class CardFactoryImpl implements CreditCardFactory {

    @Override
    public CreditCard createCreditCard(String[] cardInfo) {

        String cardNumber = cardInfo[0];

        if(cardNumber.equals("")) return null;

//        System.out.println(cardNumber.length());

        if(cardNumber.length() <= 16) {
            if(cardNumber.length() == 15 &&
                    cardNumber.startsWith("3")) { return new AmericanExpress(cardInfo); }
            if(cardNumber.startsWith("6")) { return new Discover(cardInfo); }
            if(cardNumber.startsWith("4")) { return new Visa(cardInfo); }
            if(cardNumber.startsWith("5") || cardNumber.startsWith("2")) { return new MasterCard(cardInfo); }
        }
        return null;
    }
}
