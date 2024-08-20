package com.backend_manager.bakend_manager;

import org.springframework.boot.SpringApplication;

public class TestBakendManagerApplication {

	public static void main(String[] args) {
		SpringApplication.from(BakendManagerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
