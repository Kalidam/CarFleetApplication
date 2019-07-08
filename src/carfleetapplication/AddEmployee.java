
package carfleetapplication;

/**
 *
 * @author Damian
 */
public class AddEmployee {
    
    public static String addEmployee(){
        
        String employee=ScannerUtility.getTextFromUser("Podaj imie i nazwisko pracownika");  
        return employee;
    }
}
