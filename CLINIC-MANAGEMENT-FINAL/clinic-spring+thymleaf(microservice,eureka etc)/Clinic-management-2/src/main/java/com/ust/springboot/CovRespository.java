package com.ust.springboot;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface CovRespository extends MongoRepository<Covid, String>{
	

	
}
