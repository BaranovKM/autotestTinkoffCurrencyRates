import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import units.Payload;
import units.Rate;

/**
 * Created by Константин on 27.12.2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)

public class Json {
    //класс в котором происходит разбор json ответа от сервиса
    // и проверяются валютные пары

    private String resultCode;
    private Payload payload;

    //геттеры, сеттеры и конструктор класса нужны для нормальной работы Spring
    // и его парсера
    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public Json() {
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String parse() {

        //вывод в лог "сырого" json
        String parsedJson = new String();
        parsedJson = "ResultCode : " + resultCode + "\n" + payload;
        return parsedJson;
    }

    public String checkCurrency() {
        //основной метод для проверки полученых значений в toCurrency и fromCurrency
        // и сравнение теми, какими они должны быть

        String currencyList = new String();
        //перебирается массив rates и для каждой группы сравниваются значения name и code
        for (Rate rate : payload.getRates()) {
            //сперва сравниваются для fromCurrency
            String nameFromCurrency = rate.getFromCurrency().getName();
            Integer codeFromCurrency = rate.getFromCurrency().getCode();
            Boolean checkFrom = Main.checkCorcondance(nameFromCurrency, codeFromCurrency);

            //затем для toCurrency
            String nameToCurrency = rate.getToCurrency().getName();
            Integer codeToCurrency = rate.getToCurrency().getCode();
            Boolean checkTo = Main.checkCorcondance(nameToCurrency, codeToCurrency);

            //если оба сравнения положительные, проставляется ок
            if (checkFrom && checkTo) {
                currencyList = currencyList + rate.getCategory() +
                        " " + nameFromCurrency + "/" + nameToCurrency +
                        " OK\n";
            } else {
                //если какая-то из пар не совпала с прописаными в настройках
                //то она фиксируется и записывается в лог
                currencyList = currencyList + "Несовпадение : " +
                        "fromCurrency: " + nameFromCurrency + " " + codeFromCurrency +
                        " toCurrency: " + nameToCurrency + " " + codeToCurrency +
                        "\n";
            }
        }
        return currencyList;
    }
}
