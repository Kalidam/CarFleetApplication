package carfleetapplication;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class RemoveCarFromList {
    
    private static ArrayList <Car> listOfCars;
    
    private static void setListOfCars() {
        listOfCars=SaveFileCar.getListOfCars();
    }
    
    public static Car removeCarFromList() {
        setListOfCars();
        SaveFileCar.printListOfCars();
        int carToRemove=ScannerUtility.getIntFromUser("Wybierz z listy samochód, który chcesz usunąć");
        return listOfCars.get(carToRemove);
    }
    
}
