package carfleetapplication;

/**
 *
 * @author Damian
 */
public class CarFleetApplication {

    public static void main(String[] args) {
        int selectedOption=0;
        final byte EXIT_NUMBER=7;
        while(selectedOption!=EXIT_NUMBER){
            selectedOption=Menu.menuVisualization();
            Menu.reactToSelectedOption(selectedOption);
            ScannerUtility.getTextFromUser("Naciśnij enter aby kontynuować");
        }
        System.out.println("Zakończono działanie programu.");
    }
}