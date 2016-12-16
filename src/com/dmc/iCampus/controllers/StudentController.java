package com.dmc.iCampus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dmc.iCampus.entities.Student;
import com.dmc.iCampus.services.StudentService;

@Controller
public class StudentController 
{
	@Autowired
	private StudentService studentService;	
	
	@RequestMapping("/students")
	public @ResponseBody List<String> allStudents() {
		List<String> list = studentService.getStudents();
		return list;
	}

	@RequestMapping(value="/students/{id}", method=RequestMethod.POST)
	public @ResponseBody Student findStudentById(@PathVariable(value="id") int id) {
		return studentService.getStudentById(id);
	}
	
	@RequestMapping(value="/students/addstudent", method=RequestMethod.POST)
	public @ResponseBody String insertStudent(@RequestBody Student s) {
		try {
			studentService.addStudent(s);
			return "Successfully Added";
		}catch(Exception e) {
			return e.getLocalizedMessage();
		}		
	}
}
