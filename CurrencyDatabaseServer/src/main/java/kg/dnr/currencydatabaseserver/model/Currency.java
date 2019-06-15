package kg.dnr.currencydatabaseserver.model;

import javax.xml.bind.annotation.*;


@XmlRootElement(name="Currency")
@XmlAccessorType(XmlAccessType.FIELD)
public class Currency {

    @XmlAttribute(name="ISOCode")
    String isoCode;

    @XmlElement(name = "Nominal")
    String nominal;

    @XmlElement(name = "ValidFor",required = false)
    String validFor;

    @XmlElement(name = "Value")
    String value;

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public String getValidFor() {
        return validFor;
    }

    public void setValidFor(String validFor) {
        this.validFor = validFor;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
