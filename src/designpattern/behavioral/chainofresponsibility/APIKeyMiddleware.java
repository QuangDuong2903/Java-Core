package designpattern.behavioral.chainofresponsibility;

public class APIKeyMiddleware extends Middleware {

    @Override
    public boolean check(Request request) {
        return (!request.X_APIKEY().isBlank()) && request.X_APIKEY().equals("X_APIKEY");
    }
}
