package com.spring;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.model.Student;
import com.spring.repository.StudentRepository;
import com.spring.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMongoDbStudentApplicationTests {

	@Autowired
	private StudentService service;

	@MockBean
	private StudentRepository repository;
	
	//Método create
	@Test
	public void saveStudentTest() {
		Student student = new Student("Chad", "Smith", "Masculino", "25-10-1961", "DNI", "88996537");
		when(repository.save(student)).thenReturn(student);
		assertEquals(student, service.create(student));
	}
	
	//Método getAll
	@Test
	public void getAllTest() {
		when(repository.findAll()).thenReturn(Stream.of(
				new Student("John","Frusciante","Masculino","06-11-1960","DNI","87654321"),
				new Student("Noel", "Gallagher", "Masculino", "29-05-1967", "DNI", "12345678")).
				collect(Collectors.toList()));
		assertEquals(2, service.getAll().size());
	}
	
	//Método findFirstName
	@Test
	public void findByFirstNameTest() {
		String firstName = "Noel";
		when(repository.findByFirstName(firstName)).thenReturn(Stream.of(
				new Student("Noel", "Gallagher", "Masculino", "29-05-1967","DNI", "12345678")).collect(Collectors.toList()));
		assertEquals(1, service.findByFirstName(firstName).size());
	}
	
	//Método findById
	//Método update
	
	//Método delete
	@Test
	public void deleteStudentTest() {
		service.delete("101"); //5d55c58573430d3de4e3d745
		verify(repository, times(1)).deleteById("101");
	}
}






