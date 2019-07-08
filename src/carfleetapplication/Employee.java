
package carfleetapplication;


public class Employee {
    
    private String name, surname;
    
    public Employee(String name, String surname){
        setName(name);
        setSurname(surname);
    }
    
    public void setName(String name){
        this.name=name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
}
