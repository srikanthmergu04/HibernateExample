package com.srikanth.Hibernate.client;

import com.srikanth.Hibernate.dao.StudentDao;
import com.srikanth.Hibernate.dao.StudentDaoImpl;
import com.srikanth.Hibernate.model.Student;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		
		student.setsName("Vinayak");
		student.setAge(21);
		student.setGender("Male");
		student.setDept("Cse");
		
		
		StudentDao studentDao = new StudentDaoImpl();
		
		int primary = studentDao.addStudent(student);

	}

}
