package com.spring.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Family;

@Repository
public interface FamilyRepository extends MongoRepository<Family, String>{

	public List<Family> findByIdStudent(String id_student);
	
}
