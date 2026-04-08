package builder.builder;

import builder.model.HttpRequest;

import java.util.HashMap;
import java.util.Map;

public class HttpRequestBuilder {
    private String url;
    private String method;
    private Map<String, String> headers = new HashMap<>();
    private String body;
    private Map<String, String> queryParams = new HashMap<>();
    private int timeout = 30;

    public HttpRequestBuilder setUrl(String url) {
        this.url = url;
        return this;
    }

    public HttpRequestBuilder setMethod(String method) {
        this.method = method;
        return this;
    }

    public HttpRequestBuilder addHeader(String key, String value) {
        headers.put(key, value);
        return this;
    }

    public HttpRequestBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public HttpRequestBuilder addQueryParam(String key, String value) {
        queryParams.put(key, value);
        return this;
    }

    public HttpRequestBuilder setTimeout(int timeout) {
        this.timeout = timeout;
        return this;
    }

    public HttpRequest build() {
        return new HttpRequest(
                url,
                method,
                headers,
                body,
                queryParams,
                timeout
        );
    }
}