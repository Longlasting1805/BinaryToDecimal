import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.next();

        // Check if the input is a valid binary number
        if (isValidBinary(binaryInput)){
            int decimalEquivalent = binaryToDecimal(binaryInput);

            // Print the result
            System.out.println("Decimal equivalent: "+ decimalEquivalent);
        }else {
            System.out.println("Invalid binary input. Please enter a valid binary number.");
        }

    }
    private static boolean isValidBinary(String binaryInput) {
        // Regular expression to check if the string consists only of 0s and 1s
        return binaryInput.matches("[01]+");
    }
    private static int binaryToDecimal(String binaryInput){
        int decimalEquivalent = 0;
        int length = binaryInput.length();

        for (int i = 0; i < length; i++){
            char digitChar = binaryInput.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            // Calculate the positional value and add it to the decimal equivalent
            decimalEquivalent += digit * Math.pow(2, length - i - 1);
        }
        return decimalEquivalent;
    }
}
