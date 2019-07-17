package carfleetapplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class SaveFileEmployee implements SaveFile {
    
    private final static ArrayList <Employee> LIST_OF_EMPLOYEES = new ArrayList <Employee>();
    
    public static void addToEmployeeList(){
        Employee employee=NewEmployeeCreator.createEmployeeFromUserData();
        LIST_OF_EMPLOYEES.add(employee);
        System.out.println("Pomyślnie dodano pracownika!");
    }
     
    public static void addToListEmployeeLoadedFromFile(String name, String surname){
        Employee employee=new Employee(name, surname);
        LIST_OF_EMPLOYEES.add(employee);
    }
    
    public static Employee getDriver (int employeeDriver) {
        return LIST_OF_EMPLOYEES.get(employeeDriver);
    }
    
    public static void removeEmployeeFromFile() {
        Employee employee=EmployeeFromListRemover.selectEmployeeToRemove();
        LIST_OF_EMPLOYEES.remove(employee);
        System.out.println("Pomyślnie usunięto pracownika");
    }
    
    public static void printListOfEmloyees(){
        if(!LIST_OF_EMPLOYEES.isEmpty()){
            for (int i=0; i<LIST_OF_EMPLOYEES.size(); i++){
                System.out.println(i+". "+LIST_OF_EMPLOYEES.get(i).toString());
            }
        }else{
            System.out.println("Lista pracowników jest pusta!");
        }
    }
   
    public static ArrayList getListOfEmployees(){
       return LIST_OF_EMPLOYEES;
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
            for (int i=0; i<LIST_OF_EMPLOYEES.size();i++){
                String name=LIST_OF_EMPLOYEES.get(i).getName();
                String surname=LIST_OF_EMPLOYEES.get(i).getSurname();
                String fullName=name+";"+surname;
                pw.println(fullName);
            }
        }
        catch (IOException exc){
            System.err.println("Błąd wejścia/wyjścia.");
        }
    }
}
