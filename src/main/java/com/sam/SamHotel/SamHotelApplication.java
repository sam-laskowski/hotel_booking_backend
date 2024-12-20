package com.sam.SamHotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class SamHotelApplication {
	public static void main(String[] args) {
		Dotenv.configure().load();
		SpringApplication.run(SamHotelApplication.class, args);
	}

}
