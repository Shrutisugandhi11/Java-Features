package EnhancementInCollection;

import java.util.*;

public class CollectionFactoryMethod {
    public static void main(String[] args) {
        List<String> languagesList1 = List.of("JAVA", "JAVASCRIPT", "C++");
        //languagesList1.add("Python"); Throws UnsupportedOperationException
        System.out.println(languagesList1);

        Set<String> languagesSet1 = Set.of("GO", "C", "ROR");
        //languagesSet1.add("C#"); Throws UnsupportedOperationException
        System.out.println(languagesSet1);

        //Mutability check for Map.ofEntries() vs Collections.unmodifiableMap()

        Map<Integer, String> languagesMap = Map.ofEntries(
                Map.entry(1, "Vue"),
                Map.entry(2, "React"),
//                Map.entry(2, "Spark"), Throws illegalArgumentException
                Map.entry(3, "Typescript")
                //  , Map.entry(4, null) Throws null pointer exception.
        );
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "JAVA");
        map.put(2, "JAVASCRIPT");
        map.put(3, "C++");

        //Adding values in map
        Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(map);//Wraps the map
        System.out.println(unmodifiableMap);
        map.put(4, "Oak"); //changes both original map and unmodifiable map
        //unmodifiableMap.put(4,"Oak"); direct modification will Throw UnsupportedOperationException
        System.out.println(unmodifiableMap);

        //Null Values
        map.put(5,null);
       // unmodifiableMap.put(5,null);
        System.out.println(unmodifiableMap);

        //Duplicate Values
        //unmodifiableMap.put(4,"spark"); Throws UnsupportedOperationException


        System.out.println(unmodifiableMap);




    }
}
