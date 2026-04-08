package builder.model;

import java.util.Map;

public class HttpRequest {
    private String url;
    private String method;
    private Map<String, String> headers;
    private String body;
    private Map<String, String> queryParams;
    private int timeout;

    // Constructor used by Builder
    public HttpRequest(String url, String method,
                       Map<String, String> headers,
                       String body,
                       Map<String, String> queryParams,
                       int timeout) {
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = body;
        this.queryParams = queryParams;
        this.timeout = timeout;
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", headers=" + headers +
                ", body='" + body + '\'' +
                ", queryParams=" + queryParams +
                ", timeout=" + timeout +
                '}';
    }
}