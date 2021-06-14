import java.util.Arrays;

public class MasterCard extends CreditCard {

    public MasterCard(String[] cardInfo) {
        super(cardInfo);
    }

    String cardNumber = cardInfo[0];

    @Override
    String validateCard(String cardNumber) {
        // first digit is 5 or 2
        // 2nd digit is 1-5 inclusive
        // length must be 16
        // found out char/string may need to be converted to int/long before comparison
        System.out.println(Arrays.toString(cardInfo));

        if(cardNumber.equals("") || cardNumber.length() != 16 || !cardNumber.startsWith("5") || !cardNumber.startsWith("2")) return "Invalid Card Number";

        try {
            double secondDigit = (double) cardNumber.charAt(1);

            if(cardNumber.charAt(1) <= 5 && cardNumber.charAt(1) >= 1) {
                return "MasterCard: " + Arrays.toString(cardInfo);
            }

            return "Invalid Card Number";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Invalid Card Number";
    }

}
