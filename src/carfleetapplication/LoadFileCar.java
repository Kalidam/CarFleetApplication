package carfleetapplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Damian
 */
public class LoadFileCar implements FileLocation, LoadFile{

    
    
    @Override
    public void getFileLocation(){
        FileSupport fileSupport = new FileSupport(new String[]{"txt","xls"});
        
        String fileLocationToCheck = ScannerUtility.getTextFromUser("Podaj ścieżkę docelową w którym znajduje się plik z samochodami wraz z jego rozszerzeniem.");
        fileSupport.setFileLocation(fileLocationToCheck);
        String fileLocation=fileSupport.getFileLocation();
        FileExistCheck fileExistCheck = new FileExistCheck();
        boolean isFileExist=fileExistCheck.checkIsFileExist(fileLocation);
        if(isFileExist){
            loadFromFile(fileLocation);
        }else{
            System.err.println("Brak pliku!");
            //odwolanie do menu
        }
        
        
    }
    
    @Override
    public void loadFromFile(String adressToLoadFile){
        try(FileReader reader = new FileReader(adressToLoadFile);
            BufferedReader br = new BufferedReader(reader)){
            
            String readedLineFromFile;
            String [] splitedLine;
            while((readedLineFromFile=br.readLine())!=null){
                splitedLine=readedLineFromFile.split(";");
                String brand = splitedLine[0];
                String model = splitedLine[1];
                String registrationNumber = splitedLine[2];
                String name= splitedLine[3];
                String surname= splitedLine[4];
                
                
            }
        }
        catch(IOException exc){
            System.err.println("Błąd wejścia/wyjścia.");
        }
        
    }
}
