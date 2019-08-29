package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Family;
import com.spring.service.FamilyService;

@RestController
@RequestMapping("/family")
public class FamilyController {

	@Autowired
	private FamilyService familyService;
	
	@GetMapping("/greeting")
	public String greeting() {
		return familyService.greeting();
	}
	
	@PostMapping("/create")
	public Family create(@RequestBody Family family) {
		return familyService.create(family);
	}
	
	@GetMapping("/getAll")
	public List<Family> getAll(){
		return familyService.getAll();
	}
	
	@GetMapping("/findByIdStudent/{idStudent}")
	public List<Family> findByIdStudent(@PathVariable(value = "idStudent") String idStudent){
		return familyService.findIdStudent(idStudent);
	}
	
	@PutMapping("/update")
	public Family update(@RequestBody Family family) {
		return familyService.update(family);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable(value = "id") String id) {
		familyService.deleteById(id);
		return "Se eliminó el registro del ID " + id;
	}
}




