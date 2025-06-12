package OptionalEnhancements;

import java.util.List;
import java.util.Optional;

public class OptionalMethods {


    public static void main(String[] args) {
        /**
         * Optional.of():Wraps a value to optional only non-null values are considered
         */
        Optional<String> optionalString = Optional.of("Shruti");
        optionalString.stream().filter(string -> string.startsWith("T")).forEach(System.out::println);

        /**
         * Optional.ifPresentOrElse(): optional version of if else statement
         */
        optionalString = Optional.empty();

        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Oops! no value present"));

        /**
         * Optional.or(): If actual value is not present or value gets considered
         */
        optionalString.or(() -> Optional.of("chotu"))
                .ifPresent(value -> System.out.println("Providing alternate name"));

        /**
         * Optional.stream(): used to flatten a stream
         * List<Optional<T>>; On list.stream()  ->// returns Stream<Optional<T>> <<>>
         */
        List<Optional<String>> names = List.of(
                Optional.of("Shruti"),
                Optional.empty(),
                Optional.of("Chotu")
        );
        List<Optional<String>> list1=names.stream().toList(); //results<>
        System.out.println(list1);
        List<String> list2 = names.stream().flatMap(Optional::stream).toList();// returns<>
        System.out.println(list2);
    }
}
