
public class Application {

    public static void main(String[] args) {

        String[] lines = {"5100123412341234", "07/22", "John Doe", "x"};
        CreditCardFactory factory = new CardFactoryImpl();

        CreditCard newMasterCard = factory.createCreditCard(lines);

        System.out.println("MasterCard: " + newMasterCard);
    }
}
