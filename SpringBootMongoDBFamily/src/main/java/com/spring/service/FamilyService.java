package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Family;
import com.spring.repository.FamilyRepository;

@Service
public class FamilyService {

	@Autowired
	private FamilyRepository familyRepository;
	
	public String greeting() {
		return "Mensaje de Prueba";
	}
	public Family create(Family family) {
		return familyRepository.save(family);
	}
	
	public List<Family> getAll(){
		return familyRepository.findAll();
	}
	
	public List<Family> findIdStudent(String idStudent){
		return familyRepository.findByIdStudent(idStudent);
	}
	
	public Family update(Family family) {
		return familyRepository.save(family);
	}
	
	public void deleteById(String id) {
		familyRepository.deleteById(id);
	}
}
