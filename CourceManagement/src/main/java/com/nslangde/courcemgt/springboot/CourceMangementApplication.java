package com.nslangde.courcemgt.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nslangde.courcemgt")
public class CourceMangementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourceMangementApplication.class, args);
	}
}
