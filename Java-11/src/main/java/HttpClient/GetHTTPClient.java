package HttpClient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * send(): parallel processing; returns directly the response of the request sent
 */
public class GetHTTPClient {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        //Building client
        HttpClient client = HttpClient.newHttpClient();
        //preparing request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://httpbin.org/get")).GET().build();
        //sending request and building response
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println(response.statusCode());
        System.out.println(response.sslSession().orElseGet(() -> "No object present!"));
        System.out.println(response.headers());
    }
}
