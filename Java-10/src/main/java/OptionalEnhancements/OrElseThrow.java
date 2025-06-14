package OptionalEnhancements;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * OrElseThrow()-> throwsNoSuchElementException if element is not found;
 */
public class OrElseThrow {
    public static void main(String[] args) {

        Optional<String> stringOptional1 = Optional.of("shruti");
        Optional<String> stringOptional2 = Optional.empty();

        String string1 = stringOptional1.orElseThrow();
//        String string2 = stringOptional2.orElseThrow(); //Throws:NoSuchElementsFound

        System.out.println(string1);

    }
}
