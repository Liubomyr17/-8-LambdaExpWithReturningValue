package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        MyInterface myInterface = (n1, n2) -> n1 > n2;

        System.out.println(myInterface.test(40, 35));
        System.out.println(myInterface.test(40, 45));

    }
}
