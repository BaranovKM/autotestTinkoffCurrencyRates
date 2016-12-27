import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import units.ExpectedRates;

/**
 * Created by Константин on 27.12.2016.
 */
public class Main extends Assert {

    //адрес тестируемого сервиса
    private static final String BASE_API = "https://www.tinkoff.ru/api/v1/currency_rates/";

    //Валюты и соотвествующие им коды
    public static final int RUB_CODE = 643;
    public static final String RUB_NAME = "RUB";
    public static final int USD_CODE = 840;
    public static final String USD_NAME = "USD";
    public static final int EUR_CODE = 978;
    public static final String EUR_NAME = "EUR";
    public static final int GBP_CODE = 826;
    public static final String GBP_NAME = "GBP";

    //собственно сам тест сервиса
    @Test
    public void testCurrencyRates() {
        RestTemplate restTemplate = new RestTemplate();
        //делается запрос к сервису
        Json json = restTemplate.getForObject(BASE_API, Json.class);

        // парсер json, подробно разбирает ответ сервиса и выводит все в лог
        //        System.out.println(json.parse());

        //сравниваются ожидаемый результат и реальный ответ от сервиса
        String expected = ExpectedRates.EXPECTED_RATES;
        String actual = json.checkCurrency();
        assertEquals(expected, actual);
        //если все ок, тест чекается, если нет, то выводится детальный лог
        //с выделением строк где выявлено несовпадение
    }

    //алгоритм проверки соответсвия кода и названия валюты вызывается при разборе json
    //на вход метод принимает код валюты и ее название
    public static Boolean checkCorcondance(String name, Integer code) {
        Boolean concordance;
        //полученый код проверятся на соответсвие одному из заданых в настройках теста
        //в зависимости от результата сравнения возвращается true либо false
        //если совпадений нет вообще, то тоже возвращается false
        switch (code.intValue()) {
            case RUB_CODE:
                if (name.equals(RUB_NAME)) {
                    concordance = true;
                } else {
                    concordance = false;
                }
                return concordance;
            case USD_CODE:
                if (name.equals(USD_NAME)) {
                    concordance = true;
                } else {
                    concordance = false;
                }
                return concordance;
            case EUR_CODE:
                if (name.equals(EUR_NAME)) {
                    concordance = true;
                } else {
                    concordance = false;
                }
                return concordance;
            case GBP_CODE:
                if (name.equals(GBP_NAME)) {
                    concordance = true;
                } else {
                    concordance = false;
                }
                return concordance;
            default:
                concordance = false;
        }
        return concordance;
    }

}
