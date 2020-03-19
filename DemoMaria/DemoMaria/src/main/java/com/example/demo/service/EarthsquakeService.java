package com.example.demo.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.InfoSismo;
import com.example.demo.util.FechaUtil;
//import com.example.demo.repositorry.SismoRepository;


@Service
public class EarthsquakeService implements IEarthsquakeService {
	private static final Logger log = LoggerFactory.getLogger(EarthsquakeService.class);
	 
	
	
	@Bean
    public RestTemplate getRestTemplate() {
       return new RestTemplate();
    }
	
	
	
	public InfoSismo getEarthquakeBetweenDate(String fecha_inicial, String fecha_final) {
		InfoSismo info = getRestTemplate().getForObject(
				"https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=".concat(fecha_inicial).concat("&endtime=").concat(fecha_final), InfoSismo.class);
		log.info(info.toString());
		return info;
	}
	
	public InfoSismo getEarthquakeBetweenMagnitude(String magnitud_inicial, String magnitud_final) {
		InfoSismo info = getRestTemplate().getForObject(
				"https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&minmagnitude=".concat(magnitud_inicial).concat("&maxmagnitude=").concat(magnitud_final), InfoSismo.class);
		log.info(info.toString());
		return info;
	}
	
	public InfoSismo postEarthquakeDay() {
		String strDay=FechaUtil.fechaDeDay();
		String url="https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=".concat(strDay);
		System.out.println("---->"+url);
		log.info("---->"+url);
		InfoSismo info = getRestTemplate().getForObject(url	, InfoSismo.class);
		log.info(info.toString());
		return info;
	}

}
