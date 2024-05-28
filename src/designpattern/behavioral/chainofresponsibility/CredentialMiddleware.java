package designpattern.behavioral.chainofresponsibility;

public class CredentialMiddleware extends Middleware {
    @Override
    public boolean check(Request request) {
        return !request.username().isBlank() && !request.password().isBlank()
                && request.username().equals("admin") && request.password().equals("admin");
    }
}
