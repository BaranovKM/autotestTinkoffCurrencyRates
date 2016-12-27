package units;

/**
 * Created by Константин on 27.12.2016.
 */
public class ExpectedRates {
    //Класс просто хранит шаблон ответа сервиса,
    // чтобы сравнить полученый результат с ожидаемым
    public static final String EXPECTED_RATES = "DepositClosingBenefit USD/RUB OK\n" +
            "DepositClosingBenefit EUR/RUB OK\n" +
            "DepositClosingBenefit GBP/RUB OK\n" +
            "DepositClosing USD/RUB OK\n" +
            "DepositClosing EUR/RUB OK\n" +
            "DepositClosing GBP/RUB OK\n" +
            "DepositPayments USD/RUB OK\n" +
            "DepositPayments USD/GBP OK\n" +
            "DepositPayments USD/EUR OK\n" +
            "DepositPayments EUR/RUB OK\n" +
            "DepositPayments EUR/USD OK\n" +
            "DepositPayments EUR/GBP OK\n" +
            "DepositPayments GBP/RUB OK\n" +
            "DepositPayments GBP/EUR OK\n" +
            "DepositPayments GBP/USD OK\n" +
            "DebitCardsTransfers USD/RUB OK\n" +
            "DebitCardsTransfers USD/GBP OK\n" +
            "DebitCardsTransfers USD/EUR OK\n" +
            "DebitCardsTransfers EUR/RUB OK\n" +
            "DebitCardsTransfers EUR/USD OK\n" +
            "DebitCardsTransfers EUR/GBP OK\n" +
            "DebitCardsTransfers GBP/RUB OK\n" +
            "DebitCardsTransfers GBP/EUR OK\n" +
            "DebitCardsTransfers GBP/USD OK\n" +
            "DebitCardsOperations USD/RUB OK\n" +
            "DebitCardsOperations USD/GBP OK\n" +
            "DebitCardsOperations USD/EUR OK\n" +
            "DebitCardsOperations EUR/RUB OK\n" +
            "DebitCardsOperations EUR/USD OK\n" +
            "DebitCardsOperations EUR/GBP OK\n" +
            "DebitCardsOperations GBP/RUB OK\n" +
            "DebitCardsOperations GBP/EUR OK\n" +
            "DebitCardsOperations GBP/USD OK\n" +
            "CreditCardsOperations USD/RUB OK\n" +
            "CreditCardsOperations USD/GBP OK\n" +
            "CreditCardsOperations USD/EUR OK\n" +
            "CreditCardsOperations EUR/RUB OK\n" +
            "CreditCardsOperations EUR/USD OK\n" +
            "CreditCardsOperations EUR/GBP OK\n" +
            "CreditCardsOperations GBP/RUB OK\n" +
            "CreditCardsOperations GBP/EUR OK\n" +
            "CreditCardsOperations GBP/USD OK\n" +
            "CreditCardsTransfers USD/RUB OK\n" +
            "CreditCardsTransfers EUR/RUB OK\n" +
            "CreditCardsTransfers GBP/RUB OK\n" +
            "PrepaidCardsTransfers USD/RUB OK\n" +
            "PrepaidCardsTransfers USD/GBP OK\n" +
            "PrepaidCardsTransfers USD/EUR OK\n" +
            "PrepaidCardsTransfers EUR/RUB OK\n" +
            "PrepaidCardsTransfers EUR/USD OK\n" +
            "PrepaidCardsTransfers EUR/GBP OK\n" +
            "PrepaidCardsTransfers GBP/RUB OK\n" +
            "PrepaidCardsTransfers GBP/EUR OK\n" +
            "PrepaidCardsTransfers GBP/USD OK\n" +
            "PrepaidCardsOperations USD/RUB OK\n" +
            "PrepaidCardsOperations USD/GBP OK\n" +
            "PrepaidCardsOperations USD/EUR OK\n" +
            "PrepaidCardsOperations EUR/RUB OK\n" +
            "PrepaidCardsOperations EUR/USD OK\n" +
            "PrepaidCardsOperations EUR/GBP OK\n" +
            "PrepaidCardsOperations GBP/RUB OK\n" +
            "PrepaidCardsOperations GBP/EUR OK\n" +
            "PrepaidCardsOperations GBP/USD OK\n" +
            "SavingAccountTransfers USD/RUB OK\n" +
            "SavingAccountTransfers EUR/RUB OK\n" +
            "SavingAccountTransfers EUR/USD OK\n" +
            "SavingAccountTransfers GBP/RUB OK\n" +
            "SavingAccountTransfers GBP/USD OK\n" +
            "SavingAccountTransfers GBP/EUR OK\n" +
            "CUTransferFrom10To100 EUR/USD OK\n" +
            "CUTransferFrom10To100 GBP/RUB OK\n" +
            "CUTransferFrom10To100 GBP/USD OK\n" +
            "CUTransferFrom10To100 GBP/EUR OK\n" +
            "CUTransferFrom10To100 USD/RUB OK\n" +
            "CUTransferFrom10To100 EUR/RUB OK\n" +
            "CUTransferAbove100 USD/RUB OK\n" +
            "CUTransferAbove100 EUR/RUB OK\n" +
            "CUTransferAbove100 EUR/USD OK\n" +
            "CUTransferAbove100 GBP/RUB OK\n" +
            "CUTransferAbove100 GBP/USD OK\n" +
            "CUTransferAbove100 GBP/EUR OK\n" +
            "C2CTransfers USD/RUB OK\n" +
            "C2CTransfers EUR/RUB OK\n" +
            "C2CTransfers EUR/USD OK\n" +
            "C2CTransfers GBP/RUB OK\n" +
            "C2CTransfers GBP/USD OK\n" +
            "C2CTransfers GBP/EUR OK\n" +
            "SMETransferAbove100 EUR/GBP OK\n" +
            "SMETransferAbove100 EUR/RUB OK\n" +
            "SMETransferAbove100 EUR/USD OK\n" +
            "SMETransferAbove100 GBP/EUR OK\n" +
            "SMETransferAbove100 GBP/RUB OK\n" +
            "SMETransferAbove100 GBP/USD OK\n" +
            "SMETransferAbove100 USD/EUR OK\n" +
            "SMETransferAbove100 USD/GBP OK\n" +
            "SMETransferAbove100 USD/RUB OK\n" +
            "SMETransferBelow10 EUR/GBP OK\n" +
            "SMETransferBelow10 EUR/RUB OK\n" +
            "SMETransferBelow10 EUR/USD OK\n" +
            "SMETransferBelow10 GBP/EUR OK\n" +
            "SMETransferBelow10 GBP/RUB OK\n" +
            "SMETransferBelow10 GBP/USD OK\n" +
            "SMETransferBelow10 USD/EUR OK\n" +
            "SMETransferBelow10 USD/GBP OK\n" +
            "SMETransferBelow10 USD/RUB OK\n" +
            "SMETransferFrom10To100 EUR/GBP OK\n" +
            "SMETransferFrom10To100 EUR/RUB OK\n" +
            "SMETransferFrom10To100 EUR/USD OK\n" +
            "SMETransferFrom10To100 GBP/EUR OK\n" +
            "SMETransferFrom10To100 GBP/RUB OK\n" +
            "SMETransferFrom10To100 GBP/USD OK\n" +
            "SMETransferFrom10To100 USD/EUR OK\n" +
            "SMETransferFrom10To100 USD/GBP OK\n" +
            "SMETransferFrom10To100 USD/RUB OK\n";
}