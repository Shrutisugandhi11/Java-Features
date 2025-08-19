import java.util.concurrent.Executors;
import java.util.stream.IntStream;

void main() throws InterruptedException {

    //1:Fire-and-forget
    Thread.startVirtualThread(() -> {
        System.out.println(STR."Hello from virtual thread: \{Thread.currentThread()}");
        //System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm")));
    });

    //    Thread.sleep(200);

    //2:
    try (var executorService = Executors.newVirtualThreadPerTaskExecutor()) {
        var futures = IntStream.range(1, 10)
                .mapToObj(n ->
                        executorService.submit(() -> {
                            System.out.println("Thread:" + n + Thread.activeCount());
                        })
                ).toList();

        Thread.sleep(200);

        futures.stream().forEach(future -> {
            try {
                System.out.println(future.get());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

    }
}
