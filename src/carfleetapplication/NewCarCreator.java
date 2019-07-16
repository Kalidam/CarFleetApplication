package carfleetapplication;

import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class NewCarCreator {
    
    public static Car setCarData() {
        String brand=ScannerUtility.getTextFromUser("Podaj markę pojazdu.");
        String model=ScannerUtility.getTextFromUser("Podaj model pojazdu.");
        CarOverview carOverview=new CarOverview(model, brand);
        String registrationNumber=ScannerUtility.getTextFromUser("Podaj numer rejestracyjny pojazdu.");
        SaveFileEmployee.printListOfEmloyees();
        int employeeNumber=ScannerUtility.getIntFromUser("Wybierz pracownika z listy poprzez podanie jego numeru.");
        Employee driver=getDriverFromListOfEmployees(employeeNumber);
        return new Car(carOverview, registrationNumber, driver);
    }
    
    private static Employee getDriverFromListOfEmployees(int employeeNumber) throws NullPointerException {
        ArrayList <Employee> listOfEmployees=SaveFileEmployee.getListOfEmployees();
        if(!listOfEmployees.isEmpty()){
            return listOfEmployees.get(employeeNumber);
        }else{
            throw new NullPointerException("Lista pracowników jest pusta!");
        }
    }
}
