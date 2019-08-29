package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Student;
import com.spring.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public String greeting() {
		return "Mensaje de prueba";
	}
	
	public Student create(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> getAll(){
		return studentRepository.findAll();
	}
	
	public List<Student> findByFirstName(String firstName){
		return studentRepository.findByFirstName(firstName);
	}
	
	public Optional<Student> findById(String id){
		return studentRepository.findById(id);
	}
	
	public Student update(Student student) {
		return studentRepository.save(student);
	}
	
	public void delete(String id) {
		studentRepository.deleteById(id);
	}
}




