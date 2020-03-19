package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Sismo;
import com.example.demo.repositorry.SismoRepository;


@Service
public class SismoService {
	
	 @Autowired
	    private SismoRepository sismoRepository;

	    public List<Sismo> getAllSismos() {
	        List<Sismo> sismos = new ArrayList<>();
	        sismoRepository.findAll().forEach(sismos::add);
	        return sismos;
	    }

	    public Sismo getSismo(Long id) {
	        return sismoRepository.findById(id).orElseGet(Sismo::new);
	    }

	    public void addSismo(Sismo ssm) {
	        sismoRepository.save(ssm);
	    }

	    public void updateSismo(String id, Sismo ssm) {
	        sismoRepository.save(ssm);
	    }

	    public void deleteSismo(Long id) {
	        sismoRepository.deleteById(id);
	    }
	    
	    public void addListSismo(List<Sismo> sismo) {
	    	for (Sismo sismo2 : sismo) {
				sismoRepository.save(sismo2);
			}
	    }

}
