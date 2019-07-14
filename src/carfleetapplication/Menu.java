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
        showMenuOptions();
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
    
    public enum menuOptions {
        LOAD_DATA("    1.Wczytaj wcześniej utworzone pliki."),
        PRINT_EMPLOYEES("    2.Wyświetl listę pracowników."),
        PRINT_CARS("    3.Wyświetl listę samochodów."),
        ADD_EMPLOYEE("    4.Dodaj nowego pracownika."),
        ADD_CAR("    5.Dodaj nowy pojazd."),
        SAVE_DATA("    6.Zmień kierowcę przypisanego do pojazdu."),
        REMOVE_EMPLOYEE("    7.Usuń pracownika z listy."),
        REMOVE_CAR("    8.Usuń samochód z listy."),
        EMPTY_LINE(""),
        END_PROGRAM("    9.Zakończ program i zapisz wyniki pracy.");
        
        private String messageToShow;
        menuOptions(String messageToshow) {
        this.messageToShow=messageToshow;
        }
        
        public String getMessageToShow() {
            return this.messageToShow;
        }
    }
    
    public static void showMenuOptions() {
        for(menuOptions message: menuOptions.values())
            System.out.println(message.getMessageToShow());
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
