package carfleetapplication;

/**
 *
 * @author Damian
 */
public class NewEmployeeCreator {
    
    public static Employee createEmployeeFromUserData() {
        String name=ScannerUtility.getTextFromUser("Podaj imię pracownika:");  
        String surname=ScannerUtility.getTextFromUser("Podaj nazwisko pracownika:");
        return createEmployee(name,surname);
    }
    
    public static Employee createEmployee(String name, String surname) {
        return new Employee(name,surname);
    }
}
