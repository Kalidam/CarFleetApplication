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