package kg.dnr.currencyapiserver.prox;

import java.util.List;

import kg.dnr.currencyapiserver.model.Rate;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "currency-web-server", url = "http://localhost:8700")
@RibbonClient(name = "currency-web-server")
public interface CurrencyApiProxy {
	
	@GetMapping("/rates")
	List<Rate> getRates();
	
}
