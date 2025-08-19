import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static java.lang.Thread.sleep;
import static java.util.stream.IntStream.*;

/**
 * Learnings:
 * 1)If you don’t use wait/try-with-resources the JVM may exit early and will not wait for the parked tasks to complete execution. *
 * 2) With try-with-resources (or shutdown/await), you make sure all tasks complete before JVM exits.
 */
public class VirtualThreadsFirstPreview {

    public static void main(String[] args) throws Exception {

//        var executorService = Executors.newVirtualThreadPerTaskExecutor();
        try (var executorService = Executors.newVirtualThreadPerTaskExecutor()) { //check without try
            System.out.println("First-pass");
            IntStream.range(0, 1000).forEach(n -> {

                executorService.submit(() -> {
                    try {
                        System.out.println("Second-pass");
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        System.out.println("Third-pass");
                        throw new RuntimeException(e);
                    }
                    System.out.println("Fourth-pass");
                    System.out.println("task-" + n);
                });
                System.out.println("Fifth-pass");
            });

        }
    }


}
