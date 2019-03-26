package com.srikanth.Hibernate.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.srikanth.Hibernate.dao.StudentDao;
import com.srikanth.Hibernate.dao.StudentDaoImpl;
import com.srikanth.Hibernate.model.Student;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice = 0;
		String ch = null;
		
		Student student = new Student();
		StudentDao studentDao = new StudentDaoImpl();
		List<Student> list = new ArrayList();
		
		Scanner scanner = new Scanner(System.in);
		
		do
		{
			
			System.out.println("choose the your choice\n");
			System.out.println("1.addStudent");
			System.out.println("2.updateStudent");
			System.out.println("3.deleteStudent");
			System.out.println("4.displayListStudents\n");
			
			choice = scanner.nextInt();
			
			switch(choice)
			{
			
			case 1:
				
				System.out.println("update the Details\n");
				
				System.out.println("update Name : \n");
				
				String name = scanner.next();					
				student.setsName(name);
				
				System.out.println("update Age : \n");
				int age = scanner.nextInt();
				student.setAge(age);
				
				System.out.println("update Gender : \n");
				String gender = scanner.next();
				student.setGender(gender);
				
				System.out.println("update Dept : \n");
				String branch = scanner.next();
				student.setDept(branch);
				
			int primary = studentDao.addStudent(student);
				break;
				
			case 2:
				
				System.out.println("select the id you want to update\n");
				int up = scanner.nextInt();
				studentDao.updateStudent(up);
				break;
				
			case 3:
				System.out.println("select the id you want to delete\n");
				int option = scanner.nextInt();
				studentDao.deleteStudent(option);
				break;
			case 4:
				
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
				
				break;
				
			default :
				System.out.println("you choose wrong option");
				
			
			 break;
			
			}
			
			System.out.println("\nDo you want to Continue [yes or no]\n");
			
			ch = scanner.next();
			
		}while(ch.equals("yes"));
		
	

	}

}
