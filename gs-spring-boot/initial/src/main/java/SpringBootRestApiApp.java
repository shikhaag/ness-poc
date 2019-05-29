package com.springrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@SpringBootApplication(scanBasePackages={"com.springrestapi"})// same as @Configuration @EnableAutoConfiguration @ComponentScan@Configuration @EnableAutoConfiguration @ComponentScan
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SpringBootRestApiApp {

  public static void main(String[] args) {
    System.out.println("Let's inspect the beans provided by Spring Boot:");
    SpringApplication.run(SpringBootRestApiApp.class, args);
  }
}