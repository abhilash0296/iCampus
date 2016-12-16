package com.dmc.iCampus.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmc.iCampus.daos.EventDao;
import com.dmc.iCampus.entities.Event;
import com.dmc.iCampus.entities.Student;



@Service
public class EventServiceImpl implements EventService
{
	@Autowired
	private  EventDao eventDao;
	
	@Transactional
	public Event getEventById(int id) {
		return eventDao.getEventById(id);
	}	
	
	@Transactional
	public List<String> getEventsList() {
		return eventDao.getEventsList();
	}
	
	@Transactional
	public void addEvent(Event event) {
		eventDao.addEvent(event);
	}
}
