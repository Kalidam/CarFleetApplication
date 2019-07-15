package carfleetapplication;

/**
 *
 * @author Dell
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
    
}
