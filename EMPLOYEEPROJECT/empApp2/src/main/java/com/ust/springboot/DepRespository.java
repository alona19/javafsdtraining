package com.ust.springboot;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepRespository extends MongoRepository<Dep, String>{
	

	
}
