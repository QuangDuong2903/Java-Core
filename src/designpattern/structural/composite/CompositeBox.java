package designpattern.structural.composite;

import java.util.List;

public class CompositeBox implements Box {

    private List<Box> items;

    @Override
    public double calculatePrice() {
        return items.stream().mapToDouble(Box::calculatePrice).sum();
    }

    public CompositeBox(List<Box> items) {
        this.items = items;
    }
}
