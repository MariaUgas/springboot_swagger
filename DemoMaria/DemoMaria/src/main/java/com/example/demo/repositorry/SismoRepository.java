package com.example.demo.repositorry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Sismo;

@Repository
public interface SismoRepository extends CrudRepository<Sismo, Long> {
	


}
