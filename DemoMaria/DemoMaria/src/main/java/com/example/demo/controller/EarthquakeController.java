package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.InfoSismo;
import com.example.demo.service.IEarthsquakeService;

@RestController
@RequestMapping(value = "/earthquakes")
public class EarthquakeController {
	
	
	@Autowired
	IEarthsquakeService service;
	
	@GetMapping(path="/fecha", produces = "application/json" )
	InfoSismo sismoPorFechas(@RequestParam(value = "fecha_inicial") String fecha_inicial, @RequestParam(value = "fecha_final") String fecha_final) 
    {

		return service.getEarthquakeBetweenDate(fecha_inicial, fecha_final);
    };
    
	@GetMapping(path="/magnitud", produces = "application/json" )
    InfoSismo sismoPorMagnitud(@RequestParam(value = "magnitud_inicial") String magnitud_inicial, @RequestParam(value = "magnitud_final") String magnitud_final ) 
    {

		return service.getEarthquakeBetweenMagnitude(magnitud_inicial, magnitud_final);
    };
    
   

}