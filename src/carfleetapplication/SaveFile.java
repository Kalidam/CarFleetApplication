package carfleetapplication;

/**
 *
 * @author Damian
 */
public class SaveFile {
    
    private String fileLocation;
    private String[] extensions;
    private String[] patterns;
    
    
    public SaveFile(String textToComunicate, String[] extensions){
        setExtensions(extensions);
        setFileLocation(textToComunicate); 
        
    }
    
    public void setExtensions (String[] extensions){
        this.extensions=extensions;
    }
    
    public void setPatterns (){
        String[] patterns = new String[extensions.length];
        for (int i =0; i<extensions.length; i++){
            patterns[i]=String.format("^[A-Z]:\\\\((\\w*\\s?\\w+)*\\)*((\\w*\\s?\\w+)*.%s)$", extensions[i]);
        }
        this.patterns=patterns;
    }
    
    public void setFileLocation (String textToCommunicate){
        String fileLocationToCheck=ScannerUtility.getTextFromUser(textToCommunicate);
        Boolean isFileLocationCorrect=false;
        for (String pattern:patterns){
            if(fileLocationToCheck.matches(pattern)){
                isFileLocationCorrect=true;
            }else{
                isFileLocationCorrect=false;
            }
        }
        if (isFileLocationCorrect){
            this.fileLocation=fileLocationToCheck;
        }
        else{
        throw new IllegalArgumentException("Nieprawidłowa ścieżka do pliku.");
        }
    }
    
    public String[] getExtensions (){
        return extensions;
    }
    
    public String getFileLocation(){
        return fileLocation;
    }
    
}
