package designpattern.structural.facade;

import java.math.BigDecimal;

public class CryptoExchangeFacade {

    void buyCrypto(BigDecimal amount, CryptoCurrency cryptoCurrency) {
        BitcoinTransaction bitcoinTransaction = new BitcoinTransaction();
        EthereumTransaction ethereumTransaction = new EthereumTransaction();
        MailService mailService = new MailService();
        switch (cryptoCurrency){
            case BITCOIN -> bitcoinTransaction.transferBitcoin(amount);
            case ETHEREUM -> ethereumTransaction.transferBitcoin(amount);
        }
        mailService.sendConfirmationMail();
    }
}
