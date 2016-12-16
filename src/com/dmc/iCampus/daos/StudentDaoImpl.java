package com.dmc.iCampus.daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dmc.iCampus.entities.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	 @Autowired
	 private SessionFactory factory;
	 	 
	 public Student getStudentById(int id) {
		 Session session = factory.getCurrentSession();
		 return (Student) session.get(Student.class, id);
	 }
	 
	 @SuppressWarnings("unchecked")	 
	 public List<String> getStudentList() {
		 String queryString = "from Student";
		 Session session = factory.getCurrentSession();	
		 Query q = session.createQuery(queryString);
		 return q.list();	
	 }	
}
