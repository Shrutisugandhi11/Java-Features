package VarTypeInference;

import java.util.ArrayList;
import java.util.List;

/**
 * Var: best at local level and looping
 * cannot be declared at global level or as method parameter
 */
public class LocalVarTypeInference {


    public static void main(String[] args) {
//        var shr; //CE: needs to be initialized at the time of declaration
//        shr=1;
        var name = "shruti";
        String nameWithSCP = "shruti";
        String nameStringTest = "shruti";
        String nameWithHeap = new String("shruti");

        var number = 98265;

        // name=number; CE:Cannot change the type once initializes string->int
        name = nameWithSCP;//allowed string->string
        var address = new ArrayList<>(List.of("Indore", "Pune", "Khargone"));

        //behaviour comparison with string
        System.out.println(name.equals(nameWithSCP));
        System.out.println(name == nameWithSCP);
        System.out.println(nameWithSCP.equals(nameStringTest));
        System.out.println(nameWithSCP == nameStringTest);
        System.out.println(name == nameWithHeap);
        System.out.println(name);

        System.out.println(number);
        System.out.println(address);

        // cannot store lambda expression
        //    var var=()-> () -> new Random().nextInt(100);

        var list = new ArrayList<String>();
        list.add("name");
    }
}
