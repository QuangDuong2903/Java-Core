package designpattern.decorator;

public class ChristmasTree implements ChristmasTreeComponent {

    @Override
    public void decorate() {
        System.out.println("Trang trí cây thông bình thường");
    }
}
