package com.example.MuleServerApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dbb")
public class MuleServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuleServerApplication.class, args);
	}

}
