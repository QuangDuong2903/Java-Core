package designpattern.structural.facade;

import java.math.BigDecimal;

public class EthereumTransaction {

    void transferBitcoin(BigDecimal amount) {
        System.out.println("Transferring " + amount + " ethereum");
    }
}
