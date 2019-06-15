package kg.dnr.scheduledcurrencyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScheduledCurrencyServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScheduledCurrencyServerApplication.class, args);
    }

}
