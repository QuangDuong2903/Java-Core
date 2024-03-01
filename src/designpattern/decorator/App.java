package designpattern.decorator;

public class App {

    public static void main(String[] args) {
        ChristmasTreeComponent christmasTree = new ChristmasTree();
        christmasTree.decorate();
        System.out.println("*************************************");
        ChristmasTreeComponent specialTree = new ChristmasTreeSpecialDecorator(christmasTree);
        specialTree.decorate();
        System.out.println("*************************************");
        ChristmasTreeComponent limitedTree = new ChristmasTreeLimitedDecorator(specialTree);
        limitedTree.decorate();
    }
}
