package org.springframework.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAutoConfiguration {
	static {
		System.out.println("MyAutoConfiguration init...");
	}
	@Bean
	public SimpleBean simpleBean(){
		return new SimpleBean();
	}
}
