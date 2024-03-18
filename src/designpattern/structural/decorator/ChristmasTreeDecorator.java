package designpattern.structural.decorator;

public abstract class ChristmasTreeDecorator implements ChristmasTreeComponent {

    protected ChristmasTreeComponent christmasTreeComponent;

    public ChristmasTreeDecorator(ChristmasTreeComponent christmasTreeComponent) {
        this.christmasTreeComponent = christmasTreeComponent;
    }

    @Override
    public void decorate() {
        christmasTreeComponent.decorate();
    }
}
