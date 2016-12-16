package com.dmc.iCampus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dmc.iCampus.entities.Event;
import com.dmc.iCampus.services.EventService;

@Controller
public class EventController {
	@Autowired
	private EventService eventService;		
	
	@RequestMapping("/events")
	public @ResponseBody List<String> allcompanies() {
		List<String> list = eventService.getEventsList();
		return list;
	}	
	
	@RequestMapping(value="/events/{id}", method=RequestMethod.POST)
	public @ResponseBody Event findEventById(@PathVariable(value="id") int id) {
		return eventService.getEventById(id);
	}
	
	@RequestMapping(value="/events/addevent", method=RequestMethod.POST)
	public @ResponseBody String insertEvent(@RequestBody Event event) {
		try {
			eventService.addEvent(event);
			return "Successfully Added";
		}catch(Exception e) {
			return e.getLocalizedMessage();
		}		
	}
}
