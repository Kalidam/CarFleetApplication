package carfleetapplication;

public interface LoadFile extends FileLocator{
    
    abstract void loadFromFile(String adressToLoadFile);
}
