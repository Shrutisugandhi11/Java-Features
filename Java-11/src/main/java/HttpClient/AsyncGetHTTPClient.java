package HttpClient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

/**
 * sendAsync():asynchronous processing; returns future
 */
public class AsyncGetHTTPClient {

    public static void main(String[] args) throws InterruptedException {
        //creating a client to process request
        //Thread-safe and reusable.
        HttpClient client = HttpClient.newHttpClient();

        //Building a request object
        HttpRequest request1 = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .GET().build();
        //sending request through client
        CompletableFuture<HttpResponse<String>> future = client.sendAsync(request1, HttpResponse.BodyHandlers.ofString());
                future.thenApply(HttpResponse::body).thenAccept((value ->
                        System.out.println("Response received asynchronously:\n" + value)
                )).exceptionally(ex -> {
                    System.out.println("An exception ocurred while printing...");
                    return null;
                });
        System.out.println("Executing other tasks!");
        Thread.sleep(6000);
    }
}
