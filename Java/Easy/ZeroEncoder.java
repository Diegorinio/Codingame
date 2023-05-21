package Java.Easy;
import java.util.Scanner;

public class ZeroEncoder {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter message to encode: ");
        String input = scanner.nextLine();
        
        // Encode input message
        StringBuilder encodedMessage = new StringBuilder();
        for (char c : input.toCharArray()) {
            String binary = Integer.toBinaryString(c);
            String encoded = binary.replaceAll("1", "0");
            encodedMessage.append(encoded).append(" ");
        }
        
        // Print encoded message
        System.out.println("Encoded message: " + encodedMessage.toString());
    }
}