package carfleetapplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class SaveFileEmployee implements SaveFile, FileLocation{
    
    private static ArrayList <Employee> listOfEmployees = new ArrayList <Employee>();
    
       
    public static void addToEmployeeList(){
        Employee employee = CreateNewEmployee.setEmployeeData();
        listOfEmployees.add(employee);
        System.out.println("Pomyślnie dodano pracownika!");
    }
     
    public static void addToListEmployeeLoadedFromFile(String name, String surname){
        Employee employee = CreateNewEmployee.createEmployee(name, surname);
        listOfEmployees.add(employee);
    }
    
    public static void printListOfEmloyees(){
        for (int i=0; i<listOfEmployees.size(); i++){
            String name = listOfEmployees.get(i).getName();
            String surname = listOfEmployees.get(i).getSurname();
            System.out.println(i+". "+name+" "+surname);
        }
    }
   
   
   public static ArrayList getListOfEmployees(){
       return listOfEmployees;
   }
    
    @Override
    public void getFileLocation(){
        FileSupport saveFile = new FileSupport(new String[]{"txt","xls"});
        
        String fileLocationToCheck = ScannerUtility.getTextFromUser("Podaj ścieżkę docelową dla pliku z danymi pracowników wraz z jego rozszerzeniem.");
        saveFile.setFileLocation(fileLocationToCheck);
        String fileLocation=saveFile.getFileLocation();
        saveToFile(fileLocation);
    }
    @Override
    public void saveToFile(String fileLocation){
        try(PrintWriter pw = new PrintWriter(fileLocation)){
            for (int i=0; i<listOfEmployees.size();i++){
                String name = listOfEmployees.get(i).getName();
                String surname = listOfEmployees.get(i).getSurname();
                String fullName= name+";"+surname;
                pw.println(fullName);
            }
        }
        catch (IOException exc){
            System.err.println("Błąd wejścia/wyjścia.");
        }
    }
}
