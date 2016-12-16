package com.dmc.iCampus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmc.iCampus.daos.StudentDao;
import com.dmc.iCampus.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentdao;
	
	@Transactional
	public Student getStudentById(int id) {
		return studentdao.getStudentById(id);
	}	
	
	@Transactional
	public List<String> getStudents() {
		return studentdao.getStudentList();
	}

}
