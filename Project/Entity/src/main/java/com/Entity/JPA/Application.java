package com.Entity.JPA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.text.html.parser.Entity;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Entity.class, args);
    }

}

