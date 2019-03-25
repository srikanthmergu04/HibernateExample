package com.srikanth.Hibernate.dao;

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

}
