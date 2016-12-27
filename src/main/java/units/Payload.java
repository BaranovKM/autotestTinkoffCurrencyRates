package units;

import java.util.List;

/**
 * Created by Константин on 27.12.2016.
 */
public class Payload {
    //технический класс для Spring

    private List<Rate> rates;

    public Payload() {
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Payload : " +"\n"+rates;
    }
}
