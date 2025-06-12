package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamEnhancements {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 2, 3, null, 5, 6, 7, 8, 9);
        /** takeWhile():
         *  takes element only till the condition is true
         *  if the first element in the stream itself doesn't meet the condition,
         *  Nothing is returned or printed.
         */
        list.stream().takeWhile(num -> num % 2 == 0)
                .forEach(System.out::println);
        System.out.println("-----------------------------------");

        /** dropWhile()
         * skips the elements that meets the condition
         * will return the list of elements with not matching condition
         * basically an inversion operation
         */
        list.stream().dropWhile(num -> num % 2 == 0)
                .forEach(System.out::println);


        Stream.of(list).forEach(System.out::println);
        Stream.ofNullable(list).forEach(System.out::println);

        String input1 = null;
        //Optional<String> optional2 = Optional.of(input1);//Throws NPE
        Optional<String> optional2 = Optional.ofNullable(input1);
        optional2.ifPresent(System.out::println);

        Stream.ofNullable("null")
                .forEach(System.out::println);

        /**
         * Is Iterator works same as for loop
         */
        Stream.iterate(2, num -> num <= 10, num -> num + 2)
                .forEach(System.out::println);

        Stream.iterate(1, i -> i < list.size(), i -> i + 1)
                .forEach(System.out::println);



    }
}
