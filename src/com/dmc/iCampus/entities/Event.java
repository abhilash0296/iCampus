package com.dmc.iCampus.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="EventDetail")
public class Event implements Serializable
{
	@Id
	@Column
	private int id;
	@Column
	private String CompanyName;
	@Column
	private int Datetime;
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
	private int yeargap;
	@Column
	private int workexperience;
	
	public Event() {
		super();
	}
	public Event(int id, String companyName, int datetime, String venue, String designation, int package1, float sSC,
			float hSC, int graduation, int postGraduation, int yeargap, int workexperience) {
		super();
		this.id = id;
		CompanyName = companyName;
		Datetime = datetime;
		Venue = venue;
		Designation = designation;
		Package = package1;
		SSC = sSC;
		HSC = hSC;
		Graduation = graduation;
		PostGraduation = postGraduation;
		this.yeargap = yeargap;
		this.workexperience = workexperience;
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
	public int getDatetime() {
		return Datetime;
	}
	public void setDatetime(int datetime) {
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
	public void setPackage(int package1) {
		Package = package1;
	}
	public float getSSC() {
		return SSC;
	}
	public void setSSC(float sSC) {
		SSC = sSC;
	}
	public float getHSC() {
		return HSC;
	}
	public void setHSC(float hSC) {
		HSC = hSC;
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
		return yeargap;
	}
	public void setYeargap(int yeargap) {
		this.yeargap = yeargap;
	}
	public int getWorkexperience() {
		return workexperience;
	}
	public void setWorkexperience(int workexperience) {
		this.workexperience = workexperience;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", CompanyName=" + CompanyName + ", Datetime=" + Datetime + ", Venue=" + Venue
				+ ", Designation=" + Designation + ", Package=" + Package + ", SSC=" + SSC + ", HSC=" + HSC
				+ ", Graduation=" + Graduation + ", PostGraduation=" + PostGraduation + ", yeargap=" + yeargap
				+ ", workexperience=" + workexperience + "]";
	}
	
	
	
	
	

}
