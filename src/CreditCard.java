public abstract class CreditCard {

    public String[] cardInfo;
//    private String holderName;
//    private String expiryDate;

    public CreditCard(String[] cardInfo) {
        this.cardInfo = cardInfo;
    }

    abstract String validateCard(String cardNumber);

}
