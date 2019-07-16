package carfleetapplication;

import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class ScannerUtility {

    private static final Scanner SCANNER=new Scanner(System.in);
    
    public static String getTextFromUser(String outputText) {
        System.out.println(outputText);
        return SCANNER.nextLine();        
    }
    
    public static int getIntFromUser(String outputText) {
        return Integer.parseInt(getTextFromUser(outputText));        
    }
}
