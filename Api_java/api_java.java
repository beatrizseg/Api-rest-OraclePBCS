import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class api_java {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String url = "https://pokeapi.co";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                String json = response.body();
                String outputFile = "api_java_response.csv";

                try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
                    writer.println("\"response\"");
                    writer.println("\"" + json.replace("\"", "\"\"") + "\"");
                    System.out.println("Response saved to: " + outputFile);
                }

            } else {
                System.err.println("API returned status: " + response.statusCode());
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Invalid URL: " + e.getMessage());
        } catch (IOException | InterruptedException e) {
            System.err.println("Request failed: " + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
