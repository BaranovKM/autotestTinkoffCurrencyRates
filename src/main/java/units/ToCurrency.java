package units;

/**
 * Created by Константин on 27.12.2016.
 */
public class ToCurrency {
    //технический класс для Spring

    private Integer code;
    private String name;

    public ToCurrency() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ToCurrency{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
