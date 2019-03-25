package com.srikanth.Hibernate.dao;

import java.util.List;

import com.srikanth.Hibernate.model.Student;

public interface StudentDao {
	
	public int addStudent(Student student);
	
	
	
	public List<Student> Display();
	
	

}
