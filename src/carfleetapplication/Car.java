package carfleetapplication;

import java.util.Objects;

/**
 *
 * @author Damian
 */

public class Car {

    private String registrationNumber;
    private CarOverview carOverview;
    private Employee driver;
    
    public Car (CarOverview carOverview, String registrationNumber, Employee driver) {
        setCarOverview(carOverview);
        setDriver(driver);
        setRegistrationNumber(registrationNumber);
    }
    
    public final void setDriver(Employee driver) {
        this.driver=driver;
    }
    
    public Employee getDriver() {
        return driver;
    }
        
    public final void setCarOverview(CarOverview carOverview) {
        this.carOverview=carOverview;
    }
    
    public CarOverview getCarOverview() {
        return carOverview;
    }
    
    public final void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber=registrationNumber;
    }
    
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    @Override
    public String toString() {
        return String.format("Marka %s model %s numer rejestracyjny %s dane kierowcy %s", carOverview.getBrand(), carOverview.getModel(), registrationNumber, driver.toString());
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        boolean areRegistrationNumbersEqual=EqualsUtility.areObjectsEqual(registrationNumber, other.registrationNumber);
        boolean isCarOverviewEqual=carOverview.equals(other.carOverview);
        boolean isDriverEqual=driver.equals(other.driver);
        return areRegistrationNumbersEqual && isCarOverviewEqual && isDriverEqual;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.registrationNumber);
        hash = 89 * hash + Objects.hashCode(this.carOverview);
        hash = 89 * hash + Objects.hashCode(this.driver);
        return hash;
    }
}
