package com.EmployeeDB.console;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name="workerdata")
public class EmployeeModel implements Serializable {
	public static final long SerialVersionUid=1l;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	
	@Column(nullable = false)
	private String emp_name;
	
	@Column(nullable = false)
	private int emp_age;
	
	@Column(nullable = false)
	private String emp_city;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date emp_dob;
	
	public EmployeeModel() {
		super();
	}

	public int getId() {
		return emp_id;
	}

	public void setId(int id) {
		this.emp_id = id;
	}

	public String getName() {
		return emp_name;
	}

	public void setName(String name) {
		this.emp_name = name;
	}

	public int getAge() {
		return emp_age;
	}

	public void setAge(int age) {
		this.emp_age = age;
	}

	public String getCity() {
		return emp_city;
	}

	public void setCity(String city) {
		this.emp_city = city;
	}

	public Date getDob() {
		return emp_dob;
	}

	public void setDob(Date dob) {
		this.emp_dob = dob;
	}

	@Override
	public String toString() {
		return "EmployeeModel [id=" + emp_id + ", name=" + emp_name + ", age=" + emp_age + ", city=" + emp_city + ", dob=" + emp_dob + "]";
	}
	
	
	
}
