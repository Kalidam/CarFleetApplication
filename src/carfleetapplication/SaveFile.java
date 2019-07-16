package carfleetapplication;

/**
 *
 * @author Damian
 */
public interface SaveFile extends FileLocator {
   
    abstract void saveToFile(String fileLocation);
}
