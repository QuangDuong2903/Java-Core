package designpattern.decorator;

public class ChristmasTreeLimitedDecorator extends ChristmasTreeDecorator {
    public ChristmasTreeLimitedDecorator(ChristmasTreeComponent christmasTreeComponent) {
        super(christmasTreeComponent);
    }

    public void extra() {
        System.out.println("Trang trí cây thông giới hạn");
    }

    @Override
    public void decorate() {
        super.decorate();
        extra();
    }
}
