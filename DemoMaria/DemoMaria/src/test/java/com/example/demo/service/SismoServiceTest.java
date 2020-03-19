package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.pojo.Sismo;

@SpringBootTest
class SismoServiceTest {
	private static final Logger log = LoggerFactory.getLogger(SismoServiceTest.class);
	
	@Autowired
	SismoService sService;

	@Test
	void testAddSismo() {
		Sismo s=new Sismo();
		s.setMagnitude(1.3);
		s.setPlace("Vzla");
		s.setDay(new Date());
		sService.addSismo(s);
		for (Sismo element : sService.getAllSismos()) {
			log.info("---> Sismo , place: "+element.getPlace());
			System.out.println("---> Sismo , place: "+element.getPlace());
		}
		assertEquals(1, sService.getAllSismos().size());
	}

}
