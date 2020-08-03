package com.serviceCloud.serviceImp;

import org.springframework.web.client.RestTemplate;

import com.serviceCloud.model.WeatherBean;

public class SimpleRestClient {

	
	 private static final String GET_WEATHER_ENDPOINT_URL =
	 "http://localhost:8001/?city=london&appid=ba2e26157dd2d87c9ac4ff1a959d8e8c";

	private static RestTemplate restTemplate = new RestTemplate();

	public static void main(String[] args) {
		//appProperties = new AppProperties();
		
		WeatherBean weatherDetail = restTemplate.getForObject(GET_WEATHER_ENDPOINT_URL, WeatherBean.class);
		System.out.println("Weather Detail for given city : " + weatherDetail);

	}

}