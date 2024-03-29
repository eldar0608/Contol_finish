package kg.dnr.currencyconverterserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CurrencyConverterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConverterServerApplication.class, args);
    }

}
