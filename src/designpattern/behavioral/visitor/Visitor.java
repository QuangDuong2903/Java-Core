package designpattern.behavioral.visitor;

public interface Visitor {
    void visit(House house);
    void visit(Factory factory);
}
