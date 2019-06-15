package kg.dnr.currencyapiserver.prox;

import java.util.List;

import kg.dnr.currencyapiserver.model.Rate;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(name = "currency-database-server", url = "http://localhost:8800")
@RibbonClient(name = "currency-database-server")
public interface CurrencyApiFromDBProxy {
	
	@GetMapping("/rates")
	List<Rate> getRates();
	
	@PostMapping("/rates")
	void addRates();
}
