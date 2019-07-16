package carfleetapplication;

/**
 *
 * @author Damian
 */
public class EqualsUtility {

    public static boolean areStringsEqual(String s1, String s2) {
         if (s1 == null) {
            return s2 == null;
        }else {
            return s1.equals(s2);
        }
    }
}
