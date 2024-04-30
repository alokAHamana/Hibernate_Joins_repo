package com.aa.Joins;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	private int empId;
	private String empName;
	private double empSalary;
	
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department dept;

	public Employee(int empId, String empName, double empSalary, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.dept = dept;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
