package com.srikanth.Hibernate.dao;

import java.util.List;

import com.srikanth.Hibernate.model.Student;

public interface StudentDao {
	
	public int addStudent(Student student);
	
	public int updateStudent(int primary);
	
	public List<Student> Display();
	
	public int deleteStudent(int primary);
	
	

}
