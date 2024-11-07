package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AddressControllerApp {

    public static void main(String[] args) {
        SpringApplication.run(AddressControllerApp.class,args);
        System.out.println("running the addrees service World!");
    }
}
