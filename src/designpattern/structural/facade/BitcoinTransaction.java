package designpattern.structural.facade;

import java.math.BigDecimal;

public class BitcoinTransaction {

    void transferBitcoin(BigDecimal amount) {
        System.out.println("Transferring " + amount + " bitcoin");
    }
}
