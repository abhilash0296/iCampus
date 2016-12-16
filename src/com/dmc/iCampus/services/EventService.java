package com.dmc.iCampus.services;

import java.util.List;

import com.dmc.iCampus.entities.Event;
import com.dmc.iCampus.entities.Student;

public interface EventService
{	
	void addEvent(Event event);
	Event getEventById(int id);
	List<String> getEventsList();
}
