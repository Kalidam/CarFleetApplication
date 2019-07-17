package carfleetapplication;

import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class CarFromListRemover {
    
    public static Car removeCarFromList() {
        ArrayList <Car> listOfCars=SaveFileCar.getListOfCars();
        SaveFileCar.printListOfCars();
        int carToRemove=ScannerUtility.getIntFromUser("Wybierz z listy samochód, który chcesz usunąć");
        return listOfCars.get(carToRemove);
    }
}
