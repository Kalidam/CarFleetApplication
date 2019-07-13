package carfleetapplication;

import java.io.File;

/**
 *
 * @author Damian
 */
public class FileExistCheck {
    
    public static Boolean checkIsFileExists(String fileLocation) {
        File file = new File(fileLocation);
        return file.exists();
    }
}
