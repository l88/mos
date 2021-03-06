package org.l88.test.boot.mybatis1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class BootMybatis1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootMybatis1Application.class, args);
	}
}
