package CollectorsEnhancement;

import java.awt.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * collect stream elements directly into immutable collections
 */
public class ToUnmodifiableList {
    public static void main(String[] args) {
        var list = Arrays.asList("Java", "Python", "Kotlin", "JS", "NodeJS");

        var filteredList = list.stream().filter(value -> value.contains("J"))
                .collect(Collectors.toUnmodifiableList());
        // filteredList.add("ReactJS");    throws:UnsupportedOperationException
        //filteredList.set(2,"ReactJS");   throws:UnsupportedOperationException
        System.out.println(list + " orignalList");
        System.out.println(filteredList + " filteredList");

    }

}
