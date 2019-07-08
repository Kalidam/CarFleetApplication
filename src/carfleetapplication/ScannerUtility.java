
package carfleetapplication;

import java.util.Scanner;


public class ScannerUtility {

    private static Scanner scanner = new Scanner(System.in);
    
    public static String getTextFromUser(String outputText){
        System.out.println(outputText);
        return scanner.nextLine();        
    }
    public static int getIntFromUser(String outputText){
        return Integer.parseInt(getTextFromUser(outputText));        
    }
}
