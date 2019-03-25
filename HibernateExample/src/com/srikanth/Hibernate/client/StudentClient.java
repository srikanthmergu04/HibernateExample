package com.srikanth.Hibernate.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.srikanth.Hibernate.dao.StudentDao;
import com.srikanth.Hibernate.dao.StudentDaoImpl;
import com.srikanth.Hibernate.model.Student;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student = new Student();
		
		student.setsName("SaiSaran");
		student.setAge(20);
		student.setGender("Male");
		student.setDept("cse");
		
		
		StudentDao studentDao = new StudentDaoImpl();
		
		int primary = studentDao.addStudent(student);
		
		List<Student> list = new ArrayList();
		
		list = studentDao.Display();
		
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println("---------------------------------------------");
			//System.out.println("---------------------------------------------");
			System.out.println(list.get(i).getId());
			System.out.println(list.get(i).getsName());
			System.out.println(list.get(i).getAge());
			System.out.println(list.get(i).getGender());
			System.out.println(list.get(i).getDept());
		//	System.out.println("---------------------------------------------");
			System.out.println("---------------------------------------------");
			
		}
		

	}

}
