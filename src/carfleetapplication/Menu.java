/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carfleetapplication;

/**
 *
 * @author Damian
 */
public class Menu {

    public static int menuVisualization(){
    
        System.out.println("");
        System.out.println("    *********************************************");
        System.out.println("    *                   MENU                    *");
        System.out.println("    *********************************************");
        System.out.println("    1.Wczytaj wcześniej utworzone pliki.");
        System.out.println("    2.Wyświetl listę pracowników.");
        System.out.println("    3.Wyświetl listę samochodów.");
        System.out.println("    4.Dodaj nowego pracownika.");
        System.out.println("    5.Dodaj nowy pojazd.");
        System.out.println("    6.Zmień kierowcę przypisanego do pojazdu.");
        System.out.println("");
        System.out.println("    7. Zakończ program i zapisz wyniki pracy.");
        System.out.println("");
        
        int selectedOption=ScannerUtility.getIntFromUser("Wybierz jedna z powyższych opcji poprzez podanie jej numeru.");
        return selectedOption;
    }
    
    public static void selectedOption (int selectedOption){
        switch (selectedOption){
            case 1:{
                LoadFileEmployee loadFileEmployee= new LoadFileEmployee();
                loadFileEmployee.getFileLocation();
                LoadFileCar loadFileCar= new LoadFileCar();
                loadFileCar.getFileLocation();
                break;
            }
            case 2:{
                SaveFileEmployee.printListOfEmloyees();
                break;
            }
            case 3:{
                SaveFileCar.printListOfCars();
                break;
            }
            case 4:{
                SaveFileEmployee.addToEmployeeList();
                break;
            }
            case 5:{
                SaveFileCar.addToCarList();
                break;
            }
            case 6:{
                SaveFileCar.changeDriver();
                break;
            }
            case 7:{
                SaveFileEmployee saveFileEmployee= new SaveFileEmployee();
                saveFileEmployee.getFileLocation();
                SaveFileCar saveFileCar= new SaveFileCar();
                saveFileCar.getFileLocation();
                break;
            }
            
        }
    }
}
