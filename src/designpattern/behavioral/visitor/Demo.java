package designpattern.behavioral.visitor;

public class Demo {

    public static void export(Node... node) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        for (Node n : node)
            n.accept(exportVisitor);
    }

    public static void main(String[] args) {
        House house = new House(2, 3);
        Factory factory = new Factory(3, 4);
        export(house, factory);
    }
}
