package com.spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Family")
public class Family {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String gender;
	private String birthdayDate;
	private String docType;
	private String docNumber;
	private String idStudent;
	private String familyRelationship;
	
	public Family(String firstName, String lastName, String gender, String birthdayDate, String docType,
			String docNumber, String idStudent, String familyRelationship) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthdayDate = birthdayDate;
		this.docType = docType;
		this.docNumber = docNumber;
		this.idStudent = idStudent;
		this.familyRelationship = familyRelationship;
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

	public String getId_student() {
		return idStudent;
	}

	public void setId_student(String id_student) {
		this.idStudent = id_student;
	}

	public String getParentesco() {
		return familyRelationship;
	}

	public void setParentesco(String parentesco) {
		this.familyRelationship = parentesco;
	}

	@Override
	public String toString() {
		return "Familia [Id=" + id + ", Nombre=" + firstName + ", Apellido=" + lastName + ", Género=" + gender
				+ ", Fecha de Nacimiento=" + birthdayDate + ", Tipo de Documento=" + docType + ", Número de Documento=" + docNumber
				+ ", ID Estudiante=" + idStudent + ", Parentesco=" + familyRelationship + "]";
	}
	
	
	
}
