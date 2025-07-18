import java.util.random.RandomGenerator;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        RandomGenerator number=RandomGenerator.of("L64X128MixRandom");
        for (int i=0;i<10;i++){
            System.out.println(number.nextInt(201));
        }
    }
}
