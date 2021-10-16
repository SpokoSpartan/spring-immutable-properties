package com.spot.on.properties.immutable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ImmutableProperties.class, NotCompleteImmutableProperties.class})
public class ImmutableApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImmutableApplication.class, args);
	}

}
