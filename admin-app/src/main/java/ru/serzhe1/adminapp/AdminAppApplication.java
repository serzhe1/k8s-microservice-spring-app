package ru.serzhe1.adminapp;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminAppApplication.class, args);
    }

}
