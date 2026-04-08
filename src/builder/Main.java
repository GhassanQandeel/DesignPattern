package builder;

import builder.builder.HttpRequestBuilder;
import builder.model.HttpRequest;

public class Main {
    public static void main(String[] args) {
        HttpRequest request = new HttpRequestBuilder()
        .setUrl("https://api.example.com/users")
        .setMethod("GET")
        .build();

        HttpRequest request1 = new HttpRequestBuilder()
        .setUrl("https://api.example.com/users")
        .setMethod("GET")
        .addQueryParam("age", "20")
        .addQueryParam("city", "Nablus")
        .build();

        HttpRequest request2 = new HttpRequestBuilder()
        .setUrl("https://api.example.com/profile")
        .setMethod("GET")
        .addHeader("Authorization", "Bearer token123")
        .addHeader("Accept", "application/json")
        .build();

        HttpRequest request3 = new HttpRequestBuilder()
        .setUrl("https://api.example.com/users")
        .setMethod("POST")
        .addHeader("Content-Type", "application/json")
        .setBody("{\"name\":\"Ali\",\"age\":22}")
        .build();

        HttpRequest request4 = new HttpRequestBuilder()
        .setUrl("https://api.example.com/users/1")
        .setMethod("PUT")
        .addHeader("Content-Type", "application/json")
        .setBody("{\"name\":\"Ali Updated\"}")
        .build();

        HttpRequest request5 = new HttpRequestBuilder()
        .setUrl("https://api.example.com/users/1")
        .setMethod("PUT")
        .addHeader("Content-Type", "application/json")
        .setBody("{\"name\":\"Ali Updated\"}")
        .build();

        HttpRequest request6 = new HttpRequestBuilder()
        .setUrl("https://api.example.com/users/1")
        .setMethod("DELETE")
        .build();

        HttpRequest request7 = new HttpRequestBuilder()
        .setUrl("https://api.example.com/orders")
        .setMethod("POST")
        .addHeader("Authorization", "Bearer token123")
        .addHeader("Content-Type", "application/json")
        .addQueryParam("urgent", "true")
        .setBody("{\"item\":\"laptop\"}")
        .setTimeout(60)
        .build();


        ReflectionPrinter.printObject(request);
        ReflectionPrinter.printObject(request1);
        ReflectionPrinter.printObject(request2);
        ReflectionPrinter.printObject(request3);
        ReflectionPrinter.printObject(request4);
        ReflectionPrinter.printObject(request5);
        ReflectionPrinter.printObject(request6);
        ReflectionPrinter.printObject(request7);

    }
}
