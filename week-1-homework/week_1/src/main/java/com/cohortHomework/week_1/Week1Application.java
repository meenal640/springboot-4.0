package com.cohortHomework.week_1;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class Week1Application implements CommandLineRunner {

	private final  CakeBaker cakeBaker;
	public static void main(String[] args) {
		SpringApplication.run(Week1Application.class, args);

	}

	@Override
	public void run(String... args) {
		cakeBaker.bake();
	}

}
