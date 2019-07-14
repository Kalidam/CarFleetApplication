package carfleetapplication;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class RemoveEmployeeFromList {
    
    private static ArrayList <Employee> listOfEmployees;
    private static ArrayList <Car> listOfCars;
    private static int carNumber=-1;
    private static String brand;
    private static String model;
    private static String registrationNumber;
    
    private static void setListOfEmployees() {
        listOfEmployees=SaveFileEmployee.getListOfEmployees();
    }
    
    private static void setListOfCars() {
        listOfCars=SaveFileCar.getListOfCars();
    }
            
    public static Employee selectEmployeeToRemove() {
        setListOfEmployees();
        setListOfCars();
        SaveFileEmployee.printListOfEmloyees();
        int employeeToRemove=ScannerUtility.getIntFromUser("Wybierz z listy pracownika, którego chcesz usunąć.");
        employeeIsDriver(employeeToRemove);
        return removeEmployeeFromList(employeeToRemove);
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
            if(isEmployeeADriver(car, employeeToCheck)){
                brand=car.getBrand();
                model=car.getModel();
                registrationNumber=car.getRegistrationNumber();
                return true;
            }
        }
        return false;
    }
    
    private static boolean isEmployeeADriver (Car car, Employee employeeToCheck){
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
