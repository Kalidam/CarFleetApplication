package carfleetapplication;

import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class DriverChanger {
    
    public Car selectCarToChangeDriver(int selectedCar, int selectedDriver) {
        ArrayList<Car> listOfCars=SaveFileCar.getListOfCars();
        Car car=listOfCars.get(selectedCar);
        Employee driver=SaveFileEmployee.getDriver(selectedDriver);
        car.setDriver(driver);
        return car;
    }
}
