package carfleetapplication;

/**
 *
 * @author Damian
 */
public class EqualsUtility {

    public static <T> boolean areObjectsEqual(T type1, T type2) {
         if (type1 == null) {
            return type2 == null;
        }else {
            return type1.equals(type2);
        }
    }
}
