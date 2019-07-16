package carfleetapplication;

import java.util.Objects;

/**
 *
 * @author Damian
 */
public class CarOverview {
    private String model, brand;
    
    public CarOverview(String model, String brand) {
        setModel(model);
        setBrand(brand);
    }
    
    public void setModel(String model) {
        this.model=model;
    }
    
    public void setBrand(String brand) {
        this.brand=brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getBrand() {
        return brand;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CarOverview other = (CarOverview) obj;
        boolean areBrandsEqual=EqualsUtility.areStringsEqual(brand, other.brand);
        boolean areModelEqual=EqualsUtility.areStringsEqual(model, other.model);
        return areBrandsEqual && areModelEqual;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.model);
        hash = 19 * hash + Objects.hashCode(this.brand);
        return hash;
    }
}
