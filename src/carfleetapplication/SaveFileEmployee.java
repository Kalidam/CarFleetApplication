package carfleetapplication;

import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class SaveFileEmployee {
    
    private static ArrayList <Employee> listOfEmploiers = new ArrayList <Employee>();
    
       
    public static void addToList(){
        Employee employee = new Employee();
        listOfEmploiers.add(employee );
    }
    public static void printList(){
        for (int i=0; i<listOfEmploiers.size(); i++){
            String name = listOfEmploiers.get(i).getEmployee();
            System.out.println(i+". "+ name);
        }
    }

}
