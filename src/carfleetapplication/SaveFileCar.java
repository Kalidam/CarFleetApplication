package carfleetapplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class SaveFileCar implements SaveFile {
    
    private static ArrayList <Car> listOfCars = new ArrayList<Car>();
    
    public static void addToCarList() {
        Car car=NewCarCreator.setCarData();
        listOfCars.add(car);
        System.out.println("Pomyślnie dodano samochód!");
    }
    
    public static void addToListCarLoadedFromFile(CarOverview carOverview, String registrationNumber, int employeeNumber) {
        Employee driver= SaveFileEmployee.getDriver(employeeNumber);
        Car car=new Car(carOverview, registrationNumber, driver);
        listOfCars.add(car);
    }
    
    public static void removeCarFromList() {
        Car car=CarFromListRemover.removeCarFromList();
        listOfCars.remove(car);
        System.out.println("Pomyślnie usunięto samochód!");
    }
    
    public static ArrayList getListOfCars() {
        return listOfCars;
    }
    
    public static void selectNewDriverFromUser() {
        SaveFileCar.printListOfCars();
        int selectedCar=ScannerUtility.getIntFromUser("Wybierz samochód, w którym chcesz zmienić kierowcę.");
        SaveFileEmployee.printListOfEmloyees();
        int selectedDriver=ScannerUtility.getIntFromUser("Wybierz kierowcę, którego chcesz przypisać do samochodu.");
        changeDriver(selectedCar,selectedDriver);
    }
    
    public static void changeDriver(int selectedCar, int selectedDriver) {
        DriverChanger changeDriver=new DriverChanger();
        Car car=changeDriver.selectCarToChangeDriver(selectedCar, selectedDriver);
        listOfCars.set(selectedCar, car);
        System.out.println("Pomyślnie zmieniono kierowcę!");
    }
    
    public static void printListOfCars() {
        if(!listOfCars.isEmpty()){
            for (int i=0; i<listOfCars.size(); i++){
                System.out.println(i+". "+listOfCars.toString());
            }
        }else{
            System.out.println("Lista pojazdów jest pusta!");
        }
    }
    
    @Override
    public void getFileLocationFromUserAndMakeIOOperaation() {
        FileSupport fileSupport=new FileSupport(new String[]{"txt","xls"});
        fileSupport.printExtensions();
        String fileLocationToCheck=ScannerUtility.getTextFromUser("Podaj bezwzględną ścieżkę docelową dla pliku z samochodami wraz z jego rozszerzeniem.");
        fileSupport.setFileLocation(fileLocationToCheck);
        String fileLocation=fileSupport.getFileLocation();
        saveToFile(fileLocation);
    }
    
    @Override
    public void saveToFile(String fileLocation) {
        try (PrintWriter pw=new PrintWriter(fileLocation)){
            for(int i=0; i<listOfCars.size(); i++){
                CarOverview tempCarOverview = listOfCars.get(i).getCarOverview();
                Employee tempDriver=listOfCars.get(i).getDriver();
                String brand=tempCarOverview.getBrand();
                String model=tempCarOverview.getModel();
                String registrationNumber=listOfCars.get(i).getRegistrationNumber();
                String name=tempDriver.getName();
                String surname=tempDriver.getSurname();
                String fullInformation=brand+";"+model+";"+registrationNumber+";"+name+";"+surname;
                pw.println(fullInformation);
            }
        }
        catch(IOException exc){
            System.err.println("Błąd wejścia/wyjścia.");
        }
    }
}
