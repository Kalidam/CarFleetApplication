
package carfleetapplication;

/**
 *
 * @author Damian
 */
public class AddEmployee {
    
    public static Employee addEmployee(){
        
        String name=ScannerUtility.getTextFromUser("Podaj imię pracownika:");  
        String surname =ScannerUtility.getTextFromUser("Podaj nazwisko pracownika:");
        Employee employee= new Employee (name,surname);
        return employee;
    }
}
