package com.ayna.aynastreamer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AynastreamerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AynastreamerApplication.class, args);
	}

}
