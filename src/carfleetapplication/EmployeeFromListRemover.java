package carfleetapplication;

import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class EmployeeFromListRemover {
    
    private static ArrayList <Employee> listOfEmployees;
    private static ArrayList <Car> listOfCars;
    private static int carNumber=-1;
    private static String brand, model, registrationNumber;
    
    public static Employee selectEmployeeToRemove() {
        setListOfEmployees();
        setListOfCars();
        SaveFileEmployee.printListOfEmloyees();
        int employeeToRemove=ScannerUtility.getIntFromUser("Wybierz z listy pracownika, którego chcesz usunąć.");
        employeeIsDriver(employeeToRemove);
        return removeEmployeeFromList(employeeToRemove);
    }
    
    private static void setListOfEmployees() {
        listOfEmployees=SaveFileEmployee.getListOfEmployees();
    }
    
    private static void setListOfCars() {
        listOfCars=SaveFileCar.getListOfCars();
    }
    
    private static Employee removeEmployeeFromList(int employeeToRemove) {
        if(employeeIsDriver(employeeToRemove)){
            selectAnotherDriver();
        }
        return listOfEmployees.get(employeeToRemove);
    }
    
    private static boolean employeeIsDriver(int employeeToRemove) {
        Employee employeeToCheck=listOfEmployees.get(employeeToRemove);
        for (Car car:listOfCars){
            carNumber++;
            if(isEmployeeNameAndSurnameAreThisSameAsDriver(car, employeeToCheck)){
                brand=car.getBrand();
                model=car.getModel();
                registrationNumber=car.getRegistrationNumber();
                return true;
            }
        }
        return false;
    }
    
    private static boolean isEmployeeNameAndSurnameAreThisSameAsDriver (Car car, Employee employeeToCheck){
        boolean isSurnameThisSame=car.getSurname().equals(employeeToCheck.getSurname());
        boolean isNameThisSame=car.getName().equals(employeeToCheck.getName());
        return isNameThisSame && isSurnameThisSame;
    }
    
    private static void selectAnotherDriver() {
        System.err.println("Do pracownika, któego chcesz usunąć jest przypisany samochód "+brand+" "+model+" "+registrationNumber+" - zmień kierowcę pojazdu!");
        SaveFileEmployee.printListOfEmloyees();
        int newDriver=ScannerUtility.getIntFromUser("Wybierz nowego kierowcę pojazdu.");
        SaveFileCar.changeDriver(carNumber, newDriver);
    }
}
