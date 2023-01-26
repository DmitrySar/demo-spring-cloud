package ru.evolenta.bookmicrosevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookMicroseviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookMicroseviceApplication.class, args);
    }

}
