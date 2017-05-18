package com.meetups.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User {
	@Id@GeneratedValue
private int id;
	// @NotEmpty(message = "mobile_no must be inserted")
	private  long mobile_no; 

	
public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_address() {
		return company_address;
	}
	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}
	public String getTechnical_capability() {
		return technical_capability;
	}
	public void setTechnical_capability(String technical_capability) {
		this.technical_capability = technical_capability;
	}
	//@NotEmpty(message = "email must be inserted")
	//@Email(message="please provide valid email id format ")
	private String email;
	//@NotEmpty(message = "password must be inserted")
	//@Size(min=5,max=10)
private String password;
	//@NotEmpty(message = "company_name must be inserted")
private String company_name;
	//@NotEmpty(message = "company_address must be inserted")
private String company_address;
	//@NotEmpty(message="year of exp must be inserted")
private int year_of_exp;
public int getYear_of_exp() {
	return year_of_exp;
}
public void setYear_of_exp(int year_of_exp) {
	this.year_of_exp = year_of_exp;
}
//@NotEmpty(message = "technical_capability must be inserted")
private String technical_capability;
}
