package com.aa.Joins;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	
	@Id
	private int deptId;
	private String deptName;
	private String depAdmin;
	
	
	public Department(int deptId, String deptName, String depAdmin) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.depAdmin = depAdmin;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
