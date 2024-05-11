package designpattern.behavioral.visitor;

public class Factory implements Node {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Factory(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
