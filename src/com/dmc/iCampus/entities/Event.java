package com.dmc.iCampus.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eventdetails")
public class Event implements Serializable
{
	@Id
	@Column
	private int id;
	@Column
	private String CompanyName;
	@Column
	private String Datetime;
	@Column
	private String Venue;
	@Column
	private String Designation;
	@Column
	private int Package;
	@Column
	private float SSC;
	@Column
	private float HSC;
	@Column
	private int Graduation;
	@Column
	private int PostGraduation;
	@Column
	private int Yeargap;
	@Column
	private int Workexperience;
	
	public Event() {
		super();
	}
	public Event(int id, String companyName, String datetime, String venue, String designation, int annualSalary, float ssc,
			float hsc, int graduation, int postGraduation, int yeargap, int workexperience) {
		super();
		this.id = id;
		CompanyName = companyName;
		Datetime = datetime;
		Venue = venue;
		Designation = designation;
		Package = annualSalary;
		SSC = ssc;
		HSC = hsc;
		Graduation = graduation;
		PostGraduation = postGraduation;
		this.Yeargap = yeargap;
		this.Workexperience = workexperience;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getDatetime() {
		return Datetime;
	}
	public void setDatetime(String datetime) {
		Datetime = datetime;
	}
	public String getVenue() {
		return Venue;
	}
	public void setVenue(String venue) {
		Venue = venue;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getPackage() {
		return Package;
	}
	public void setPackage(int annualSalary) {
		Package = annualSalary;
	}
	public float getSSC() {
		return SSC;
	}
	public void setSSC(float ssc) {
		SSC = ssc;
	}
	public float getHSC() {
		return HSC;
	}
	public void setHSC(float hsc) {
		HSC = hsc;
	}
	public int getGraduation() {
		return Graduation;
	}
	public void setGraduation(int graduation) {
		Graduation = graduation;
	}
	public int getPostGraduation() {
		return PostGraduation;
	}
	public void setPostGraduation(int postGraduation) {
		PostGraduation = postGraduation;
	}
	public int getYeargap() {
		return Yeargap;
	}
	public void setYeargap(int yeargap) {
		this.Yeargap = yeargap;
	}
	public int getWorkexperience() {
		return Workexperience;
	}
	public void setWorkexperience(int workexperience) {
		this.Workexperience = workexperience;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", CompanyName=" + CompanyName + ", Datetime=" + Datetime + ", Venue=" + Venue
				+ ", Designation=" + Designation + ", Package=" + Package + ", SSC=" + SSC + ", HSC=" + HSC
				+ ", Graduation=" + Graduation + ", PostGraduation=" + PostGraduation + ", yeargap=" + Yeargap
				+ ", workexperience=" + Workexperience + "]";
	}
	
	
	
	
	

}
