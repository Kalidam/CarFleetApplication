package carfleetapplication;

/**
 *
 * @author Damian
 */
public class NewEmployeeCreator {
    
    public static Employee createEmployeeFromUserData() {
        String name=ScannerUtility.getTextFromUser("Podaj imię pracownika:");  
        String surname=ScannerUtility.getTextFromUser("Podaj nazwisko pracownika:");
        return new Employee(name,surname);
    }
}
