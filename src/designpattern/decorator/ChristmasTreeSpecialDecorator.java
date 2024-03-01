package designpattern.decorator;

public class ChristmasTreeSpecialDecorator extends ChristmasTreeDecorator {
    public ChristmasTreeSpecialDecorator(ChristmasTreeComponent christmasTreeComponent) {
        super(christmasTreeComponent);
    }

    public void extra() {
        System.out.println("Trang trí cây thông đặc biệt");
    }

    @Override
    public void decorate() {
        super.decorate();
        extra();
    }
}
