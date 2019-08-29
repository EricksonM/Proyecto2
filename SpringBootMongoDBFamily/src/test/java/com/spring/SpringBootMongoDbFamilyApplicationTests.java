package com.spring;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.model.Family;
import com.spring.repository.FamilyRepository;
import com.spring.service.FamilyService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMongoDbFamilyApplicationTests {

	@Autowired
	private FamilyService familyService;

	@MockBean
	private FamilyRepository familyRepository;
	
	@Test
	public void getAllTest() {
		when(familyRepository.findAll()).thenReturn(Stream.of(
				new Family("Liam","Gallagher","Masculino","12-10-1977","DNI","10293847","101","Hermano"),
				new Family("Matt", "Frusciante", "Masculino", "11-11-1978", "DNI", "99887766", "102", "Hermano")).
				collect(Collectors.toList()));
		assertEquals(2, familyService.getAll().size());
	}
	
	@Test
	public void createTest() {
		Family family = new Family("Paul", "McCartney", "Masculino", "19-09-1980", "DNI", "12344321", "103", "Hermano");
		when(familyRepository.save(family)).thenReturn(family);
		assertEquals(family, familyService.create(family));
	}
	
}






