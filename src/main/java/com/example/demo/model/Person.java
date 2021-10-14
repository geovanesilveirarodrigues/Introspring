package com.example.demo.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Person {
	private String name;
	private String emaill;
	private String cellPhone;
	@JsonFormat(pattern = "YYYY-MM-dd")
	private LocalDate birdthDay;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmaill() {
		return emaill;
	}
	public void setEmaill(String emaill) {
		this.emaill = emaill;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public LocalDate getBirdthDay() {
		return birdthDay;
	}
	public void setBirdthDay(LocalDate birdthDay) {
		this.birdthDay = birdthDay;
	}
	public Person(String name, String emaill, String cellPhone, LocalDate birdthDay) {
		this.name = name;
		this.emaill = emaill;
		this.cellPhone = cellPhone;
		this.birdthDay = birdthDay;
	}
}

