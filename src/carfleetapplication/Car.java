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
    
    public void setDriver(Employee driver) {
        this.driver=driver;
    }
    
    public Employee getDriver() {
        return driver;
    }
        
    public void setCarOverview(CarOverview carOverview) {
        this.carOverview=carOverview;
    }
    
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber=registrationNumber;
    }
    
    public String getBrand() {
        return carOverview.getBrand();
    }
    
    public String getModel() {
        return carOverview.getModel();
    }
    
    public String getRegistrationNumber() {
        return registrationNumber;
    }
        
    public String getName() {
        return driver.getName();
    }
    
    public String getSurname() {
        return driver.getSurname();
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
        boolean areRegistrationNumberEqual=EqualsUtility.areObjectsEqual(registrationNumber, other.registrationNumber);
        boolean isCarOverviewTrue=carOverview.equals(other.carOverview);
        boolean isDriverTrue=driver.equals(other.driver);
        return areRegistrationNumberEqual && isCarOverviewTrue && isDriverTrue;
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
