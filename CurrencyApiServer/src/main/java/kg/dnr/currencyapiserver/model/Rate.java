package kg.dnr.currencyapiserver.model;

public class Rate {

	private String code;
	private Double value;
	private String createdDate;
	
	public Rate() {}
	


	public Rate(String code, Double value, String date) {
		this.code = code;
		this.value = value;
		this.createdDate = date;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getValue() {
		
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public String getDate() {
		return createdDate;
	}

	public void setDate(String date) {
		this.createdDate = date;
	}
	
}
