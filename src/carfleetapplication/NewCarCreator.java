package carfleetapplication;

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
        return createCar(carOverview, registrationNumber, employeeNumber);
    }
    
    public static Car createCar(CarOverview carOverview, String registrationNumber, int employeeNumber) {
        return new Car(carOverview, registrationNumber, employeeNumber);
    }
}
