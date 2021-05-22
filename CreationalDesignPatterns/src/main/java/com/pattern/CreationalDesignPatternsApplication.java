package com.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.pattern.prototype.ProtoFalse;
import com.pattern.prototype.ProtoTrue;

@SpringBootApplication
public class CreationalDesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreationalDesignPatternsApplication.class, args);
	}

	@Bean
	public ProtoFalse protoFalse() {
		return new ProtoFalse();
	}
	
	@Bean
	@Scope("prototype")
	public ProtoTrue protoTrue() {
		return new ProtoTrue();
	}
}
