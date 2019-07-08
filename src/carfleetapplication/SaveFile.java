package carfleetapplication;

/**
 *
 * @author Damian
 */
public class SaveFile {
    
    private String fileLocation="C:\\Program Files\\";
    
    public SaveFile(String fileLocation){
        setFileLocation(fileLocation);
    }
    
    public void setFileLocation (String fileLocation){
        this.fileLocation=fileLocation;
    }
    
}
