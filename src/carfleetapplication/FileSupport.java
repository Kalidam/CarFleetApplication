package carfleetapplication;

/**
 *
 * @author Damian
 */
public class FileSupport {
    
    private String fileLocation;
    private String[] extensions;
    private String[] patterns;

    public FileSupport(String[] extensions) {
        setExtensions(extensions);
    }
    
    public void setFileLocation(String fileLocationToCheck) {
        Boolean isFileLocationCorrect=checkFileLocation(fileLocationToCheck);
        if (isFileLocationCorrect){
            this.fileLocation=fileLocationToCheck;
        }
        else{
            throw new IllegalArgumentException("Nieprawidłowa ścieżka do pliku.");
        }
    }

    private boolean checkFileLocation(String fileLocationToCheck) {
        for (String pattern:patterns){
            if(fileLocationToCheck.matches(pattern)){
                return true;
            }
        }
        return false;
    }
    
    public String getFileLocation() {
        return fileLocation;
    }
    
    public void setExtensions(String[] extensions) {
        this.extensions=extensions.clone();
        setPatterns();
    }
    
    private void setPatterns() {
        String[] patterns=new String[extensions.length];
        final String regexToCheckAbsolutePathAndAcceptableExtension="(^[A-Z]:\\\\((\\w*\\s?\\w+)*\\\\)*((\\w*\\s?\\w+)*.%s)$)";
        for (int i =0; i<extensions.length; i++){
            patterns[i]=String.format(regexToCheckAbsolutePathAndAcceptableExtension, extensions[i]);
        }
        this.patterns=patterns;
    }
    
    public String[] getExtensions() {
        return extensions;
    }
    
    public void printExtensions() {
        System.out.println("Dopuszczalne rozszerzenia pliku:");
        for (String extension:extensions){
            System.out.println(extension);
        }
    }
}
