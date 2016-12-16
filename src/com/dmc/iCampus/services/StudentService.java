package com.dmc.iCampus.services;

import java.util.List;

import com.dmc.iCampus.entities.Student;

public interface StudentService {	
	
	void addStudent(Student s);
	Student getStudentById(int id);
	List<String> getStudents();			
}
