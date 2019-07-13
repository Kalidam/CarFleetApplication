
package carfleetapplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class SaveFileCar implements SaveFile, FileLocation {
    
    private static ArrayList <Car> listOfCars = new ArrayList<Car>();
    
    public static void addToCarList(){
        Car car = CreateNewCar.setCarData();
        listOfCars.add(car);
    }
    
    public static void addToListCarLoadedFromFile(String brand, String model, String registrationNumber, int employeeNumber){
        Car car = CreateNewCar.createCar(brand, model, registrationNumber, employeeNumber);
        listOfCars.add(car);
    }
    
    public static ArrayList getListOfCars(){
        return listOfCars;
    }
    
    public static void changeDriver(){
        SaveFileCar.printListOfCars();
        int selectedCar = ScannerUtility.getIntFromUser("Wybierz samochód, w którym chcesz zmienić kierowcę.");
        SaveFileEmployee.printListOfEmloyees();
        int selectedDriver=ScannerUtility.getIntFromUser("Wybierz kierowcę, którego chcesz przypisać do samochodu.");
        ChangeDriver changeDriver = new ChangeDriver();
        Car car = changeDriver.selectCarToChangeDriver(selectedCar, selectedDriver);
        listOfCars.set(selectedCar, car);
    }
    
    public static void printListOfCars(){
        for (int i=0; i<listOfCars.size(); i++){
            String brand = listOfCars.get(i).getBrand();
            String model = listOfCars.get(i).getModel();
            String registrationNumber = listOfCars.get(i).getRegistrationNumber();
            String name = listOfCars.get(i).getName();
            String surname = listOfCars.get(i).getSurname();
            System.out.println(i+". "+brand+" "+model+" "+registrationNumber+" "+name+" "+surname);
        }
    }
    
    @Override
    public void getFileLocation(){
        FileSupport fileSupport = new FileSupport(new String[]{"txt","xls"});
        
        String fileLocationToCheck = ScannerUtility.getTextFromUser("Podaj ścieżkę docelową dla pliku z samochodami wraz z jego rozszerzeniem.");
        fileSupport.setFileLocation(fileLocationToCheck);
        String fileLocation=fileSupport.getFileLocation();
        saveToFile(fileLocation);
    }
    
    @Override
    public void saveToFile(String fileLocation){
        try (PrintWriter pw = new PrintWriter(fileLocation)){
            for(int i=0; i<listOfCars.size(); i++){
                String brand = listOfCars.get(i).getBrand();
                String model = listOfCars.get(i).getModel();
                String registrationNumber = listOfCars.get(i).getRegistrationNumber();
                String name = listOfCars.get(i).getName();
                String surname = listOfCars.get(i).getSurname();
                String fullInformation=brand+";"+model+";"+registrationNumber+";"+name+";"+surname;
                pw.println(fullInformation);
            }
        }
        catch(IOException exc){
            System.err.println("Błąd wejścia/wyjścia.");
        }
    
    }
    
}
