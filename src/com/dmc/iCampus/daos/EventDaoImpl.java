package com.dmc.iCampus.daos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dmc.iCampus.entities.Event;
import com.dmc.iCampus.entities.Student;


@Repository
public class EventDaoImpl implements EventDao 
{
	 @Autowired
	 private SessionFactory factory;
	 
	 public Event getEventById(int id) {
		 Session session = factory.getCurrentSession();
		 return (Event) session.get(Event.class, id);
	 }
	 @SuppressWarnings("unchecked")	 
	 public List<String> getEventsList() {
		 String queryString = "from Event";
		 Session session = factory.getCurrentSession();	
		 Query q = session.createQuery(queryString);
		 return q.list();	
	 }
	 public void addEvent(Event event) {
			Session session = factory.getCurrentSession();
			session.save(event);
		}
}
