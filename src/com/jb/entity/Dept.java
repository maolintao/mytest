package com.jb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "brpms.abd")
public class Dept {
	@Id
	private String id;
	private String dept_name;
	private String super_dept;

	public String getSuper_dept() {
		return super_dept;
	}

	public void setSuper_dept(String super_dept) {
		this.super_dept = super_dept;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

}
