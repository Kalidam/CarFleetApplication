package carfleetapplication;

import java.util.ArrayList;

public class Car {

    private String registrationNumber;
    private CarOverview carOverview;
    private ArrayList <Employee> listOfEmployees;
    private Employee driver;
    
    public Car (CarOverview carOverview, String registrationNumber, int employeeNumber) {
        setListOfEmploies();
        setCarOverview(carOverview);
        setDriverFromListOfEmployees(employeeNumber);
        setRegistrationNumber(registrationNumber);
    }
    
    public void setListOfEmploies() {
        this.listOfEmployees=SaveFileEmployee.getListOfEmployees();
    }
    
    public void setDriverFromListOfEmployees(int employeeNumber) throws NullPointerException {
        if(!listOfEmployees.isEmpty()){
            driver=listOfEmployees.get(employeeNumber);
        }else{
            throw new NullPointerException("Lista pracowników jest pusta!");
        }
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
    
    public Employee getDriver() {
        return driver;
    }
    
    public String getName() {
        return driver.getName();
    }
    
    public String getSurname() {
        return driver.getSurname();
    }
    
    public void changeDriver(int changedEmloyeeNumber) {
        setDriverFromListOfEmployees(changedEmloyeeNumber);
    }
    
    @Override
    public String toString() {
        return String.format("Marka %s model %s numer rejestracyjny %s dane kierowcy %s", carOverview.getBrand(), carOverview.getModel(), registrationNumber, driver.toString());
    }
}
