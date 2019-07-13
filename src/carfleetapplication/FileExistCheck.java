package carfleetapplication;

import java.io.File;

/**
 *
 * @author Damian
 */
public class FileExistCheck {
    
    public Boolean checkIsFileExist(String fileLocation){
        
        File file = new File(fileLocation);
        if(file.exists()){
            return true;
        }
        return false;
    }
    
}
