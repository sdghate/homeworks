public class LuhnAlgorithm {
    public static void main(String[] args) {
        String creditCardNumber = "4532015112830366"; // Replace with your credit card number

        if (isValidCreditCard(creditCardNumber)) {
            System.out.println("Valid credit card number.");
        } else {
            System.out.println("Invalid credit card number.");
        }
    }

    public static boolean isValidCreditCard(String creditCardNumber) {
        int sum = 0;
        boolean alternate = false;

        // Iterate over the credit card number digits from right to left
        for (int i = creditCardNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(creditCardNumber.charAt(i));

            if (alternate) {
                digit *= 2;

                // If doubling results in a two-digit number, subtract 9
                if (digit > 9) {
                    digit -= 9;
                }
            }

            sum += digit;
            alternate = !alternate;
        }

        // Check if the sum is a multiple of 10
        return (sum % 10 == 0);
    }
}
