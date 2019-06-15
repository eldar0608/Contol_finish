package kg.dnr.currencyapiserver.controller;

import java.util.List;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import kg.dnr.currencyapiserver.model.Rate;
import kg.dnr.currencyapiserver.prox.CurrencyApiFromDBProxy;
import kg.dnr.currencyapiserver.prox.CurrencyApiProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyApiController {

	private final CurrencyApiProxy cap;
	private final CurrencyApiFromDBProxy capDB;


	public CurrencyApiController(CurrencyApiProxy cap, CurrencyApiFromDBProxy capDB) {
		this.cap = cap;
		this.capDB = capDB;
	}


	@GetMapping("/rates")
	@HystrixCommand(fallbackMethod="getRatesFromDB")
	public List<Rate> getRates() {
		
		if(capDB.getRates().isEmpty())
			capDB.addRates();
			
		return cap.getRates();
	}
	
	@GetMapping("/ratesFromDB")
	public List<Rate> getRatesFromDB() {
		return capDB.getRates();
	}
}
