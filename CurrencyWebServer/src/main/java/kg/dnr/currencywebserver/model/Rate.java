package kg.dnr.currencywebserver.model;


public class Rate {
    private String code;
    private String value;

    public Rate(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public Rate(Currency rate){
        this.code = rate.getIsoCode();
        this.value = rate.getValue();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
