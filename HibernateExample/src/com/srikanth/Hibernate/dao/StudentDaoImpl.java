package com.srikanth.Hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.srikanth.Hibernate.model.Student;
import com.srikanth.Hibernate.util.StudentUtil;

public class StudentDaoImpl implements StudentDao {



	@Override
	public int addStudent(Student student) {
		// TODO Auto-generated method stub
		
		Session session = null;
		session = StudentUtil.getSession();
		Transaction trnx = session.beginTransaction();
		int primary = (int) session.save(student);
		trnx.commit();
		return primary;
		
		//return 0;
	}

	@Override
	public List<Student> Display() {
		// TODO Auto-generated method stub
		
		Session session = null;
		session = StudentUtil.getSession();
		//Transaction trnx = session.beginTransaction();
		//int primary = (int) session.save(student);
		//trnx.commit();
		
		
		List<Student> list = new ArrayList();
		
		//session.createQuery("from Student");
		Query query = (Query) session.createQuery("from Student");
		
		list = query.list();
		
//	System.out.println(list.get(0).getId());
	//System.out.println(list.get(0).getsName());
		return list;
	}

	@Override
	public int updateStudent(int primary) {
		// TODO Auto-generated method stub
		
		Session session = null;
		session = StudentUtil.getSession();
		Transaction trnx = session.beginTransaction();
		
		Student student =   (Student) session.load(Student.class, primary);
		
		student.setsName("Jeevan");
		student.setAge(23);
		student.setGender("Male");
		student.setDept("Cse");
		
		session.update(student);
		
		//int primary = (int) session.save(student);
		trnx.commit();
		
		
		return 0;
	}

	@Override
	public int deleteStudent(int primary) {
		// TODO Auto-generated method stub
		
		Session session = null;
		session = StudentUtil.getSession();
		
		Transaction trnx = session.beginTransaction();
		
		Student student =   (Student) session.load(Student.class, primary);
		
		session.delete(student);
		
		trnx.commit();
		
		return 0;
	}

}
