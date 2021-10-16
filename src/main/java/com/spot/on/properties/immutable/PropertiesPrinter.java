package com.spot.on.properties.immutable;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
@RequiredArgsConstructor
public class PropertiesPrinter  {

	private final ImmutableProperties immutableProperties;
	private final NotCompleteImmutableProperties notCompleteProperties;

	@PostConstruct
	public void printProperties() {
		log.info("Injected immutable properties:" +
				"\nName: " + immutableProperties.getName() +
				"\nValue: " + immutableProperties.getValue());

		log.info("Injected immutable properties that was not configured fully:" +
				"\nName: " + notCompleteProperties.getName() +
				"\nValue: " + notCompleteProperties.getValue());
	}

}
