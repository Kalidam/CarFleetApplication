package carfleetapplication;

import java.util.Objects;

/**
 *
 * @author Damian
 */
public class Employee {
    
    private String name, surname;
    
    public Employee(String name, String surname) {
        setName(name);
        setSurname(surname);
    }
    
    public void setName(String name) {
        this.name=name;
    }
    public void setSurname(String surname) {
        this.surname=surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    
    @Override
    public String toString() {
        return String.format("Imię pracownika %s nazwisko pracownika %s", name, surname);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        boolean areNameEqual=EqualsUtility.areObjectsEqual(name, other.name);
        boolean areSurnameEqual=EqualsUtility.areObjectsEqual(surname, other.surname);
        return areNameEqual && areSurnameEqual;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.surname);
        return hash;
    }
}
