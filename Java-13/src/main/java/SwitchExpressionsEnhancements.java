import java.util.Scanner;

public class SwitchExpressionsEnhancements {


    public static void main(String[] args) {
        System.out.println(":".repeat(10) + "Welcome To the restaurant" + ":".repeat(10));
        int weekDay = new Scanner(System.in).nextInt();
        var restaurantMenu = switch (weekDay) {
            case 1 -> "Italian";
            case 2 -> "Chinese";
            case 3 -> {
                System.out.println("You've chosen a delicious menu");
                yield "Thai";
            }
            case 4 -> "Turkish";
            case 5 -> "Arabian";
            case 6 -> "Mexican";
            case 7 -> "Fusion";
            default -> throw new IllegalStateException("Unexpected value:Please enter a valid week day! " + weekDay);
        };
        System.out.println(":".repeat(10) + "Welcome To the restaurant, Today's menu is:" + restaurantMenu + ":".repeat(10));
    }

}
