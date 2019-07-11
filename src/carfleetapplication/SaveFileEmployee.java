package carfleetapplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class SaveFileEmployee implements Save{
    
    private static ArrayList <Employee> listOfEmploiers = new ArrayList <Employee>();
    
       
    public static void addToList(){
        Employee employee = AddEmployee.addEmployee();
        listOfEmploiers.add(employee);
    }
     
   public static void printList(){
        for (int i=0; i<listOfEmploiers.size(); i++){
            String name = listOfEmploiers.get(i).getName();
            String surname = listOfEmploiers.get(i).getSurname();
            System.out.println(i+". "+ name + " " + surname);
        }
    }
    @Override
    public void saveToFile(){
        SaveFile saveFile = new SaveFile(new String[]{"txt","xls"});
        saveFile.printExtensions();
        String fileLocationToCheck = ScannerUtility.getTextFromUser("Podaj ścieżkę docelową dla pliku z danymi pracowników wraz z jego rozszerzeniem.");
        saveFile.setFileLocation(fileLocationToCheck);
        String fileLocation=saveFile.getFileLocation();
        try(PrintWriter pw = new PrintWriter(fileLocation)){
            for (int i=0; i<listOfEmploiers.size();i++){
                String name = listOfEmploiers.get(i).getName();
                String surname = listOfEmploiers.get(i).getSurname();
                String fullName= name+";"+surname;
                pw.println(fullName);
            }
        }
        catch (IOException exc){
            System.err.println("Błąd wejścia/wyjścia.");
        }
    }
}
