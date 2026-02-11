package exercicios.execiciosapi;

import com.sun.net.httpserver.HttpServer;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.InetSocketAddress;

public class ApiServer {
    static ProductRepository repository = new ProductRepository();
    static Gson gson = new Gson();

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/products", exchange -> {
            String method = exchange.getRequestMethod();
            String response = "";
            int status = 200;

            String body = new String(exchange.getRequestBody().readAllBytes());

            try {
                switch (method) {
                    case "GET":
                        response = gson.toJson(repository.findAll());
                        break;

                    case "POST":
                        Product newP = gson.fromJson(body, Product.class);
                        repository.save(newP);
                        response = "{\"message\": \"Created\"}";
                        status = 201;
                        break;

                    case "DELETE":
                        Product toDelete = gson.fromJson(body, Product.class);
                        repository.delete(toDelete.getId());
                        response = "{\"message\": \"Deleted\"}";
                        break;

                    case "PUT":
                        Product updatedProduct = gson.fromJson(body, Product.class);
                        repository.update(updatedProduct.getId(), updatedProduct);
                        response = "{\"message\": \"Updated\"}";
                        break;

                    default:
                        status = 405;
                        response = "{\"error\": \"Method not supported\"}";
                }
            } catch (ProductException e) {
                status = 400; //(erro do cliente)
                response = "{\"error\": \"" + e.getMessage() + "\"}";
            } catch (Exception e) {
                status = 500; // (erro genérico)
                response = "{\"error\": \"Unexpected server error\"}";
            }

            exchange.getResponseHeaders().set("Content-Type", "application/json");
            exchange.sendResponseHeaders(status, response.getBytes().length);
            exchange.getResponseBody().write(response.getBytes());
            exchange.getResponseBody().close();
        });

        System.out.println("http://localhost:8080/products");
        server.start();
    }
}