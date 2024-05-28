package designpattern.behavioral.chainofresponsibility;

public abstract class Middleware {

    private Middleware next;

    public void setNext(Middleware next) {
        this.next = next;
    }

    public abstract boolean check(Request request);

    protected boolean handle(Request request) {
        if (next == null || !check(request))
            return check(request);
        return next.check(request);
    }

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }
}
