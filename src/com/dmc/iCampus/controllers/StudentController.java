package com.dmc.iCampus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
}
