package iti.jets.user_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import iti.jets.user_app.mappers.UserMapper;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "iti.jets.user_app.interfaces")
public class UserAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAppApplication.class, args);
	}

	


}
