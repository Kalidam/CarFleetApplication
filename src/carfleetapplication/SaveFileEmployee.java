package carfleetapplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class SaveFileEmployee extends SaveFile implements Save{
    
    private static ArrayList <Employee> listOfEmploiers = new ArrayList <Employee>();
    
       
    public static void addToList(){
        String[] fullName = AddEmployee.addEmployee();
        Employee employee = new Employee(fullName[0], fullName[1]);
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
    public Boolean saveToFile(){
        String fileLocation= super.setFileLocation("Podaj ścieżkę docelową dla pliku z danymi pracowników.");
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
            return false;
        }
        return true;
    }
}
