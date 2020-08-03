package com.serviceCloud.service.controller;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.serviceCloud.model.WeatherBean;

@RestController
public class WeatherController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public WeatherBean fetchCityTemp(@QueryParam(value = "q") String city, @QueryParam(value = "appid") String appid) {

		final String ROOT_URI = "http://api.openweathermap.org/data/2.5/weather?q=" + city
				+ "&appid="+appid;
		ResponseEntity<WeatherBean> response = restTemplate.getForEntity(ROOT_URI, WeatherBean.class);
		System.out.println("Response: response.getBody()" + response);
		return response.getBody();
	}

}
