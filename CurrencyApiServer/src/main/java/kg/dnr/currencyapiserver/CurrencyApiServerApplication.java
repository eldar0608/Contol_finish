package kg.dnr.currencyapiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableFeignClients
public class CurrencyApiServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyApiServerApplication.class, args);
    }

}
