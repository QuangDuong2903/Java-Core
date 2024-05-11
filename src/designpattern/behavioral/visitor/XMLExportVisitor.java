package designpattern.behavioral.visitor;

public class XMLExportVisitor implements Visitor {
    @Override
    public void visit(House house) {
        System.out.println("Exporting house located at (" + house.getX() + "," + house.getY() + ") in XML format");
    }

    @Override
    public void visit(Factory factory) {
        System.out.println("Exporting house located at (" + factory.getX() + "," + factory.getY() + ") in XML format");
    }
}
