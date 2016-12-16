package com.dmc.iCampus.daos;

import java.util.List;

import com.dmc.iCampus.entities.Student;

public interface StudentDao
{
	Student getStudentById(int id);
	List<String> getStudentList();
}
