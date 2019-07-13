package carfleetapplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class LoadFileCar implements LoadFile {

    private ArrayList <Employee> listOfEmployees;
    
    @Override
    public void getFileLocationFromUserAndMakeIOOperaation(){
        FileSupport fileSupport = new FileSupport(new String[]{"txt","xls"});
        fileSupport.printExtensions();
        String fileLocationToCheck = ScannerUtility.getTextFromUser("Podaj bezwzględną ścieżkę docelową w którym znajduje się plik z samochodami wraz z jego rozszerzeniem.");
        fileSupport.setFileLocation(fileLocationToCheck);
        String fileLocation=fileSupport.getFileLocation();
        FileExistCheck fileExistCheck = new FileExistCheck();
        boolean isFileExist=fileExistCheck.checkIsFileExists(fileLocation);
        if(isFileExist){
            loadFromFile(fileLocation);
        }else{
            System.err.println("Brak pliku!");
        }
        
        
    }
    
    @Override
    public void loadFromFile(String adressToLoadFile){
        try(FileReader reader = new FileReader(adressToLoadFile);
            BufferedReader br = new BufferedReader(reader)){
            listOfEmployees=SaveFileEmployee.getListOfEmployees();
            String readedLineFromFile;
            String[] splitedLine;
            while((readedLineFromFile=br.readLine())!=null){
                splitedLine=readedLineFromFile.split(";");
                String brand = splitedLine[0];
                String model = splitedLine[1];
                String registrationNumber = splitedLine[2];
                String name= splitedLine[3];
                String surname= splitedLine[4];
                int driverOrderNumber=checkDriver(name, surname);
                SaveFileCar.addToListCarLoadedFromFile(brand, model, registrationNumber, driverOrderNumber);
            }
            System.out.println("Wczytano dane zawarte w pliku!");
        }
        catch(IOException exc){
            System.err.println("Błąd wejścia/wyjścia.");
        }
        
    }
    
    public int checkDriver(String name, String surname) throws IllegalArgumentException {
        int driverOrderNumber=-1;
        for(int i=0; i<listOfEmployees.size();i++){
            if(surname.equals(listOfEmployees.get(i).getSurname())){
                if(name.equals(listOfEmployees.get(i).getName())){
                    driverOrderNumber=i;
                    break;
                }
            }
        }
            if (driverOrderNumber<0){
                throw new IllegalArgumentException("Brak pracownika we wskazanym pliku.");
            }
        return driverOrderNumber;
    }
}
