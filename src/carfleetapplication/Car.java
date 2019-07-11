/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carfleetapplication;

import java.util.ArrayList;

public class Car {

    private String brand, model, registrationNumber, name, surname;
    private ArrayList <Employee> listOfEmploiers;
    
    public Car (String brand, String model, String registrationNumber, int employeeNumber){
        setListOfEmploies();
        setBrand(brand);
        setModel(model);
        setRegistrationNumber(registrationNumber);
        setName(employeeNumber);

    }
    
    public void setListOfEmploies(){
        this.listOfEmploiers=SaveFileEmployee.getListOfEmployers();
    }
    
    public void setBrand(String brand){
        this.brand=brand;
    }
    
    public void setModel(String model){
        this.model=model;
    }
    
    public void setRegistrationNumber (String registrationNumber){
        this.registrationNumber=registrationNumber;
    }
    
    public void setName (int employeeNumber){
        this.name=listOfEmploiers.get(employeeNumber).getName();
    }
    
    public void setSurname (int employeeNumber){
        this.surname=listOfEmploiers.get(employeeNumber).getSurname();
    }
    
    public String getBrand(){
        return brand;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
}
