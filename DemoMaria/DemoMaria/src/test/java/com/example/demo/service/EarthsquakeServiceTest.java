package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.InfoSismo;


@SpringBootTest
class EarthsquakeServiceTest {
	
	@Autowired
	IEarthsquakeService service;

	@Test
	void testGetEarthquakeBetweenDate() {
	   InfoSismo info= service.getEarthquakeBetweenDate("2020-01-01", "2020-01-02");
    	assertEquals(200, info.getMetadata().getStatus().intValue());
	}

	@Test
	void testGetEarthquakeBetweenMagnitude() {
		 InfoSismo info= service.getEarthquakeBetweenDate("1.3", "1.3");
	     assertEquals(200, info.getMetadata().getStatus().intValue());
	}

	@Test
	void testPostEarthquakeDay() {
		 InfoSismo info= service.postEarthquakeDay();
	     assertEquals(200, info.getMetadata().getStatus().intValue());
	}

}
