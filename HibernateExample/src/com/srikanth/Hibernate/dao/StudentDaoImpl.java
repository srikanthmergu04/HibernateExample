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

}
