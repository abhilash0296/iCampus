package com.dmc.iCampus.services;

import java.util.List;

import com.dmc.iCampus.entities.Student;

public interface StudentService {	
	Student getStudentById(int id);
	List<String> getStudents();			
}
