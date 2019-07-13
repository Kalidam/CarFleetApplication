
package carfleetapplication;

import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class ChangeDriver {
    
    private ArrayList<Car> listOfCars;
    
    private void setListOfCars() {
        listOfCars=SaveFileCar.getListOfCars();
    }
    
    public Car selectCarToChangeDriver(int selectedCar, int selectedDriver) {
        setListOfCars();
        Car car = listOfCars.get(selectedCar);
        car.changeDriver(selectedDriver);
        return car;
    }
}
