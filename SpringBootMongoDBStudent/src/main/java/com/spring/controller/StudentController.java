package com.spring.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Student;
import com.spring.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/greeting")
	public String greeting() {
		return studentService.greeting();
	}
	
	@PostMapping("/create")
	public Student create(@RequestBody Student student) {
		return studentService.create(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAll(){
		return studentService.getAll();
	}
	
	@GetMapping("/firstName/{firstName}")
	public List<Student> findByFirstName(@PathVariable(value = "firstName") String firstName){
		return studentService.findByFirstName(firstName);
	}
	
	@GetMapping("/id/{id}")
	public Optional<Student> findById(@PathVariable(value = "id") String id){
		return studentService.findById(id);
	}
	
	@PutMapping("/update")
	public Student update(@RequestBody Student student) {
		return studentService.update(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathParam(value = "id") String id) {
		studentService.delete(id);
		return "Se eliminó el registro del ID "+ id;
	}
	
}







