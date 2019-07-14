package carfleetapplication;

/**
 *
 * @author Damian
 */
public class Menu {

    public static int menuVisualization() {
        System.out.println("");
        System.out.println("    *********************************************");
        System.out.println("    *                   MENU                    *");
        System.out.println("    *********************************************");
        System.out.println("");
        System.out.println("    1.Wczytaj wcześniej utworzone pliki.");
        System.out.println("    2.Wyświetl listę pracowników.");
        System.out.println("    3.Wyświetl listę samochodów.");
        System.out.println("    4.Dodaj nowego pracownika.");
        System.out.println("    5.Dodaj nowy pojazd.");
        System.out.println("    6.Zmień kierowcę przypisanego do pojazdu.");
        System.out.println("    7.Usuń pracownika z listy.");
        System.out.println("    8.Usuń samochód z listy.");
        System.out.println("");
        System.out.println("    9.Zakończ program i zapisz wyniki pracy.");
        int selectedOption=ScannerUtility.getIntFromUser("Wybierz jedną z powyższych opcji poprzez podanie jej numeru.");
        return selectedOption;
    }
    
    public static void reactToSelectedOption (int selectedOption) {
        switch (selectedOption){
            case 1:{
                loadData();
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
                SaveFileCar.selectNewDriverFromUser();
                break;
            }
            case 7:{
                SaveFileEmployee.removeEmployeeFromFile();
                break;
            }
            case 8:{
                SaveFileCar.removeCarFromList();
                break;
            }
            case 9:{
                saveData();
                break;
            }
        }
    }
    
    private static void loadData(){
        LoadFileEmployee loadFileEmployee=new LoadFileEmployee();
        loadFileEmployee.getFileLocationFromUserAndMakeIOOperaation();
        LoadFileCar loadFileCar=new LoadFileCar();
        loadFileCar.getFileLocationFromUserAndMakeIOOperaation();
    }
    
    private static void saveData(){
        SaveFileEmployee saveFileEmployee=new SaveFileEmployee();
        saveFileEmployee.getFileLocationFromUserAndMakeIOOperaation();
        SaveFileCar saveFileCar=new SaveFileCar();
        saveFileCar.getFileLocationFromUserAndMakeIOOperaation();
    }
}
