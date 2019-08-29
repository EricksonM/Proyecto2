package com.spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String gender;
	private String birthdayDate;
	private String docType;
	private String docNumber;
	
	public Student(String firstName, String lastName, String gender, String birthdayDate, String docType,
			String docNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthdayDate = birthdayDate;
		this.docType = docType;
		this.docNumber = docNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(String birthdayDate) {
		this.birthdayDate = birthdayDate;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	@Override
	public String toString() {
		return "Student [Id=" + id + ", Nombre=" + firstName + ", Apellido=" + lastName + ", Género=" + gender
				+ ", Fecha de Nacimiento=" + birthdayDate + ", Tipo de Documento=" + docType + ", Npumero de Documento=" + docNumber + "]";
	}
	
	
	
}
