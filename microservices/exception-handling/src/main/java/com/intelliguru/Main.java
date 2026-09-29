package com.intelliguru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

//        System.out.println(".................Total Beans in Application......................");
//        String[] beans = context.getBeanDefinitionNames();
//        Arrays.stream(beans)
//                .sorted()
//                .forEach(System.out::println);

    }

}
