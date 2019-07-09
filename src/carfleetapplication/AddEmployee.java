
package carfleetapplication;

/**
 *
 * @author Damian
 */
public class AddEmployee {
    
    public static String [] addEmployee(){
        
        String [] fullName = new String [2];
        String name=ScannerUtility.getTextFromUser("Podaj imię pracownika:");  
        String surname =ScannerUtility.getTextFromUser("Podaj nazwisko pracownika:");
        fullName[0]=name;
        fullName[1]=surname;
        return fullName;
    }
}
