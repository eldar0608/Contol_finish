package kg.dnr.currencydatabaseserver.model;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name="CurrencyRates")
@XmlAccessorType(XmlAccessType.FIELD)
public class CurrencyRates {

    @XmlAttribute(name="Date")
    String date;

    @XmlAttribute(name="Name")
    String name;

    @XmlElement(name ="Currency")
    List<Currency> currencyList;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Currency> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }
}
