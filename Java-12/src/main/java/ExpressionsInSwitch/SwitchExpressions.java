package ExpressionsInSwitch;

import java.util.Scanner;

public class SwitchExpressions {
    public static void main(String[] args) {
        String name="Shruti";
       String surname= switch (name) {
           case "Shruti" -> "Sugandhi";
           case "company"->"Epam systems";
           case "level"->"A2";
           default -> throw new IllegalStateException("Unexpected value: " + name);
       };
        System.out.println(name+" "+surname);
        System.out.println("*".repeat(10)+"Welcome To the restaurant"+"*".repeat(10));

        int weekDay= new Scanner(System.in).nextInt();
        String restuarantMenu=switch (weekDay){
            case 1->"Italian";
            case 2->"Chinese";
            case 3->"Thai";
            case 4->"Turkish";
            case 5->"Arabian";
            case 6->"Mexican";
            case 7->"Fusion";
            default -> throw new IllegalStateException("Unexpected value:Please enter a valid week day! " + weekDay);
        };
        System.out.println("Today's special menu is::::"+restuarantMenu);



    }
}
