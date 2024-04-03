package designpattern.structural.facade;

import java.math.BigDecimal;

public class Demo {

    public static void main(String[] args) {
        // Nếu như không sử dụng facade
        BitcoinTransaction transaction = new BitcoinTransaction();
        transaction.transferBitcoin(BigDecimal.valueOf(10000));
        MailService mailService = new MailService();
        mailService.sendConfirmationMail();

        // Sử dụng facade
        CryptoExchangeFacade facade = new CryptoExchangeFacade();
        facade.buyCrypto(BigDecimal.valueOf(20000), CryptoCurrency.BITCOIN);
        facade.buyCrypto(BigDecimal.valueOf(50000), CryptoCurrency.ETHEREUM);
    }
}
