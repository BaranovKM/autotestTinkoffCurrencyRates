package units;

/**
 * Created by Константин on 27.12.2016.
 */
public class Rate {
    //технический класс для Spring

    private String category;

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    private String buy;
    private FromCurrency fromCurrency;
    private ToCurrency toCurrency;

    public Rate() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public FromCurrency getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(FromCurrency fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public ToCurrency getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(ToCurrency toCurrency) {
        this.toCurrency = toCurrency;
    }

    @Override
    public String toString() {
        return "--------------------------------" +"\n"+
                "category='" + category + '\'' +
                ", fromCurrency=" + fromCurrency +
                ", toCurrency=" + toCurrency +
                ", BUY : }"+buy+"\n";
    }
}
