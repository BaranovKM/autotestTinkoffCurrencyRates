package units;

/**
 * Created by Константин on 27.12.2016.
 */
public class FromCurrency {
    //технический класс для Spring

    private String name;
    private Integer code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public FromCurrency() {
    }

    @Override
    public String toString() {
        return "FromCurrency{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
