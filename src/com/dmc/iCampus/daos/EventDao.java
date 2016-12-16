package com.dmc.iCampus.daos;

import java.util.List;

import com.dmc.iCampus.entities.Event;
import com.dmc.iCampus.entities.Student;


public interface EventDao 
{	
	void addEvent(Event event);
	Event getEventById(int id);
	List<String> getEventsList();
}
