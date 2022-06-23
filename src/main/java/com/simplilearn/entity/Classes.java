package com.simplilearn.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;

import javax.persistence.CascadeType;

@Entity
@Table(name="class_table")
public class Classes {

	@Id
	@GeneratedValue
	private int class_id;
	
	@Column(name="class_name")
	private String class_name;
	
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="classes")
	private List<Student> students;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="classes")
	private List<Subject> subjects;
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

}
