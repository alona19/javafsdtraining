package com.example.demo;


import org.springframework.data.mongodb.repository.MongoRepository;


public interface CovidRespository extends MongoRepository<Covid, String>{
	

	
}
