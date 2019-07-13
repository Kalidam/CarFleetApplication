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
        while(selectedOption!=7){
            selectedOption= Menu.menuVisualization();
            Menu.selectedOption(selectedOption);
            ScannerUtility.getTextFromUser("Naciśnij enter aby kontynuować");
        }
        System.out.println("Zakończono działanie programu.");

    }
    
}
