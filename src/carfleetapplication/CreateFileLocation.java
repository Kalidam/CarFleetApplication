/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carfleetapplication;


public class CreateFileLocation {
    
    private String[] extensions;
    private String[] patterns;
    
    public CreateFileLocation(String textToComunicate, String[] extensions){
        setExtensions(extensions);
        setFileLocation(textToComunicate); 
    }
    
    public void setExtensions (String[] extensions){
        this.extensions=extensions;
        setPatterns();
    }
    
    private void setPatterns (){
        String[] patterns = new String[extensions.length];
        for (int i =0; i<extensions.length; i++){
            patterns[i]=String.format("^[A-Z]:\\\\((\\w*\\s?\\w+)*\\)*((\\w*\\s?\\w+)*.%s)$", extensions[i]);
        }
        this.patterns=patterns;
    }
    
    public void setFileLocation (String textToCommunicate){
        String fileLocationToCheck=ScannerUtility.getTextFromUser(textToCommunicate);
        SaveFile saveFile= new SaveFile (fileLocationToCheck, patterns);
    }
    
    public String[] getExtensions (){
        return extensions;
    }
    

    

}

