/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carfleetapplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LoadFileEmployee implements LoadFile {
       
    
    @Override
    public void getFileLocationFromUserAndMakeIOOperaation(){
        FileSupport fileSupport = new FileSupport(new String[]{"txt","xls"});
        fileSupport.printExtensions();
        String fileLocationToCheck = ScannerUtility.getTextFromUser("Podaj bezwzględną ścieżkę docelową w którym znajduje się plik z pracownikami wraz z jego rozszerzeniem.");
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
    public void loadFromFile(String adressToLoadFile) {
        try(FileReader reader = new FileReader(adressToLoadFile);
            BufferedReader br = new BufferedReader(reader)){
            String readedLineFromFile;
            String[] splitedLine;
            while((readedLineFromFile=br.readLine())!=null){
                splitedLine=readedLineFromFile.split(";");
                String name= splitedLine[0];
                String surname= splitedLine[1];
                SaveFileEmployee.addToListEmployeeLoadedFromFile(name, surname);
            }
            System.out.println("Wczytano dane zawarte w pliku!");
        }
        catch(IOException exc){
            System.err.println("Błąd wejścia/wyjścia.");
        }
    }
}
