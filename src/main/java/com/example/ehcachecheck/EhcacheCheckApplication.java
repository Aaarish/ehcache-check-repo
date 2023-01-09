package com.example.ehcachecheck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Method;
import java.util.Arrays;

@SpringBootApplication
@EnableCaching
public class EhcacheCheckApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhcacheCheckApplication.class, args);
	}

	@Bean
	public KeyGenerator multiplyKeyGenerator() {
		return (Object target, Method method, Object... params) -> method.getName() + "_" + Arrays.toString(params);
	}
}
