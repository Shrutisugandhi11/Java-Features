import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MethodAdditions {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> integerList = list.stream().filter(Predicate.not(num -> num % 2 == 0))
                .collect(Collectors.toList());
        System.out.println(integerList);
    }
}
