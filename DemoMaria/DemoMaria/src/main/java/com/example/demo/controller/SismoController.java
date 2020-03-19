package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.converter.SismoConverter;
import com.example.demo.dto.InfoSismo;
import com.example.demo.pojo.Sismo;
import com.example.demo.service.IEarthsquakeService;
import com.example.demo.service.SismoService;

@RestController
@RequestMapping(value = "/earthquakes")
public class SismoController 
{
	
	@Autowired
	IEarthsquakeService eService;
	
	@Autowired
	SismoService sismoService;
	
	
    @GetMapping(path="/sismo", produces = "application/json" )
    List<Sismo> sismoDelDia() 
    {
    	InfoSismo info=eService.postEarthquakeDay();
    	sismoService.addListSismo(SismoConverter.converterToListSismo(info));
        return sismoService.getAllSismos();
    }
}