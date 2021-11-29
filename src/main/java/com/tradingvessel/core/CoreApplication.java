package com.tradingvessel.core;

import com.tradingvessel.core.persistence.demo_data.DemoDataLoader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner createModelData(DemoDataLoader loader) {
		return args -> {
			loader.createDemoData();
		};
	}

}
