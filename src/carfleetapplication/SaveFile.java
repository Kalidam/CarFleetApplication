package carfleetapplication;

/**
 *
 * @author Damian
 */
public class SaveFile {
    
    private String fileLocation;

    
    
    public SaveFile(String fileLocationToCheck, String[] patterns){
        setFileLocation(fileLocationToCheck,patterns);    
    }
    
    public void setFileLocation (String fileLocationToCheck, String[] patterns){
        Boolean isFileLocationCorrect=checkFileLocation(fileLocationToCheck, patterns);

        if (isFileLocationCorrect){
            this.fileLocation=fileLocationToCheck;
        }
        else{
        throw new IllegalArgumentException("Nieprawidłowa ścieżka do pliku.");
        }
    }

    public boolean checkFileLocation(String fileLocationToCheck, String[] patterns){
        for (String pattern:patterns){
            if(fileLocationToCheck.matches(pattern)){
                return true;
            }
        }
        return false;
    }
    
    public String getFileLocation(){
        return fileLocation;
    }
}
