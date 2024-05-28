package designpattern.behavioral.chainofresponsibility;

public class Demo {

    public static void main(String[] args) {
        Request request = new Request("X_APIKEY", "admin", "admin");
        Middleware middleware = Middleware.link(
                new APIKeyMiddleware(),
                new CredentialMiddleware()
        );
        System.out.println(middleware.handle(request));
    }
}
