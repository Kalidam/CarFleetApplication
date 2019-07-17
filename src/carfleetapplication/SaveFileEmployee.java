package carfleetapplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class SaveFileEmployee implements SaveFile {
    
    private static ArrayList <Employee> listOfEmployees = new ArrayList <Employee>();
    
    public static void addToEmployeeList(){
        Employee employee=NewEmployeeCreator.createEmployeeFromUserData();
        listOfEmployees.add(employee);
        System.out.println("Pomyślnie dodano pracownika!");
    }
     
    public static void addToListEmployeeLoadedFromFile(String name, String surname){
        Employee employee=new Employee(name, surname);
        listOfEmployees.add(employee);
    }
    
    public static Employee getDriver (int employeeDriver) {
        return listOfEmployees.get(employeeDriver);
    }
    
    public static void removeEmployeeFromFile() {
        Employee employee=EmployeeFromListRemover.selectEmployeeToRemove();
        listOfEmployees.remove(employee);
        System.out.println("Pomyślnie usunięto pracownika");
    }
    
    public static void printListOfEmloyees(){
        if(!listOfEmployees.isEmpty()){
            for (int i=0; i<listOfEmployees.size(); i++){
                System.out.println(i+". "+listOfEmployees.get(i).toString());
            }
        }else{
            System.out.println("Lista pracowników jest pusta!");
        }
    }
   
    public static ArrayList getListOfEmployees(){
       return listOfEmployees;
   }
    
    @Override
    public void getFileLocationFromUserAndMakeIOOperaation(){
        FileSupport fileSupport=new FileSupport(new String[]{"txt","xls"});
        fileSupport.printExtensions();
        String fileLocationToCheck=ScannerUtility.getTextFromUser("Podaj bezwzględną ścieżkę docelową dla pliku z danymi pracowników wraz z jego rozszerzeniem.");
        fileSupport.setFileLocation(fileLocationToCheck);
        String fileLocation=fileSupport.getFileLocation();
        saveToFile(fileLocation);
    }
    @Override
    public void saveToFile(String fileLocation) {
        try(PrintWriter pw=new PrintWriter(fileLocation)){
            for (int i=0; i<listOfEmployees.size();i++){
                String name=listOfEmployees.get(i).getName();
                String surname=listOfEmployees.get(i).getSurname();
                String fullName=name+";"+surname;
                pw.println(fullName);
            }
        }
        catch (IOException exc){
            System.err.println("Błąd wejścia/wyjścia.");
        }
    }
}
