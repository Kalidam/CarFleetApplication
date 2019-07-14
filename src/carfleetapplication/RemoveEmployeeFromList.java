package carfleetapplication;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class RemoveEmployeeFromList {
    
    private static ArrayList <Employee> listOfEmployees;
    private static ArrayList <Car> listOfCars;
    
    private static void setListOfEmployees() {
        listOfEmployees=SaveFileEmployee.getListOfEmployees();
    }
    
    private static void setListOfCars() {
        listOfCars=SaveFileCar.getListOfCars();
    }
            
    public static Employee removeEmployeeFromList() {
        setListOfEmployees();
        setListOfCars();
        SaveFileEmployee.printListOfEmloyees();
        int employeeToRemove=ScannerUtility.getIntFromUser("Wybierz z listy pracownika, którego chcesz usunąć.");
        Employee employeeToCheck=listOfEmployees.get(employeeToRemove);
        int carNumber=-1;
        for (Car car:listOfCars){
            carNumber++;
            if(car.getSurname().equals(employeeToCheck.getSurname())){
                if(car.getName().equals(employeeToCheck.getName())){
                    String brand=car.getBrand();
                    String model=car.getModel();
                    String registrationNumber=car.getRegistrationNumber();
                    System.err.println("Do pracownika, któego chcesz usunąć jest przypisany samochód "+brand+" "+model+" "+registrationNumber+" - zmień kierowcę pojazdu!");
                    SaveFileEmployee.printListOfEmloyees();
                    int newDriver=ScannerUtility.getIntFromUser("Wybierz nowego kierowcę pojazdu.");
                    SaveFileCar.changeDriver(carNumber, newDriver);
                }
            }
        }
        return listOfEmployees.get(employeeToRemove);
    }    
}
