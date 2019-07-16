package carfleetapplication;

/**
 *
 * @author Damian
 */
public interface LoadFile extends FileLocator{
    
    abstract void loadFromFile(String adressToLoadFile);
}
