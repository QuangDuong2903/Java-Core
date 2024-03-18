package designpattern.structural.decorator;

public class ChristmasTree implements ChristmasTreeComponent {

    @Override
    public void decorate() {
        System.out.println("Trang trí cây thông bình thường");
    }
}
