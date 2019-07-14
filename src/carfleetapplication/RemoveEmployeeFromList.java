package carfleetapplication;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class RemoveEmployeeFromList {
    
    public static Employee removeEmployeeFromList() {
        ArrayList <Employee> listOfEmployees=SaveFileEmployee.getListOfEmployees();
        SaveFileEmployee.printListOfEmloyees();
        int employeeToRemove=ScannerUtility.getIntFromUser("Wybierz z listy pracownika, którego chcesz usunąć");
        return listOfEmployees.get(employeeToRemove);
    }    
}
