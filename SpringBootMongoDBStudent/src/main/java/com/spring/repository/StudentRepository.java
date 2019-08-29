package com.spring.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String>{

	public List<Student> findByFirstName(String firstName);
	
}
