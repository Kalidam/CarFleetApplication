package carfleetapplication;

/**
 *
 * @author Damian
 */
public abstract class SaveFile {
    
    private String fileLocation="C:\\Program Files\\";
    
        
    public String setFileLocation (String textToCommunicate){
        this.fileLocation=ScannerUtility.getTextFromUser(textToCommunicate);
        return fileLocation;
    }
    
    
}
