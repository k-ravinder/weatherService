package com.serviceCloud.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config.properties")
public class AppProperties {
	@Value("${city}")
	private String city;

	public String getCity() {

		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}