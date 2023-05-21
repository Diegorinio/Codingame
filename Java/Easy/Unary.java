//Some parts of code are not mine
//That's right i stole it, but only loser wouldn't take advantage of it
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        //Read input.
        Scanner scanner = new Scanner(System.in);
        String MESSAGE = scanner.nextLine();
    
        String BINARY = "";
        
        for (int i = 0; i < MESSAGE.length(); i++)
        {
            String charInBinary = Integer.toBinaryString((int)MESSAGE.charAt(i));
            
            //Fill binary representation with zeroes to get 7 bit.
            charInBinary = "0000000".substring(charInBinary.length()) + charInBinary;
            
            BINARY += charInBinary;
        }
        char lastChar = ' ';
        String codedMessage = "";
        String[] encodedBits = new String[] { " 00 0", " 0 0" };
        
        for (int i = 0; i < BINARY.length(); i++)
        {
            if (BINARY.charAt(i) != lastChar)
            {
                lastChar = BINARY.charAt(i);
                codedMessage += encodedBits[lastChar - '0'];
            }
            else
            {
                codedMessage += "0";
            }
        }
        
        //Print encoded message.
        System.out.println(codedMessage.substring(1));
    }
}