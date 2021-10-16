package com.spot.on.properties.immutable;

import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Value
@ConstructorBinding
@ConfigurationProperties("spot.on.non.complete.immutable")
public class NotCompleteImmutableProperties {

	String name;
	String value;

}
