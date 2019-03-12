package com.cfgdc.crm.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserApplication {

  public static void main(String[] args) {
    System.setProperty("spring.config.name", "service-user");
    SpringApplication.run(UserApplication.class, args);
  }
}
