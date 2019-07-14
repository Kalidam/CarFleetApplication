package carfleetapplication;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class RemoveCarFromList {
    
    public static Car removeCarFromList() {
        ArrayList <Car> listOfCars = SaveFileCar.getListOfCars();
        SaveFileCar.printListOfCars();
        int carToRemove=ScannerUtility.getIntFromUser("Wybierz z listy samochód, który chcesz usunąć");
        return listOfCars.get(carToRemove);
    }
    
}
