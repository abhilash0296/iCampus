package com.dmc.iCampus.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student implements Serializable
{
	@Id
	@Column
	private int id;
	@Column
	private String FirstName;
	@Column
	private String MiddleName;
	@Column
	private String LastName;
	@Column
	private String Colony;
	@Column
	private String City;
	@Column
	private String State;
	@Column
	private int Pincode;
	@Column
	private int ContactNo;
	@Column
	private String Emailid;
	@Column
	private int Candidateid;
	@Column
	private String Gender;
	@Column
	private Date DateOfBirth;
	@Column
	private float ssc;
	@Column
	private float hhc;
	@Column
	private float graduation;
	@Column
	private float postgraduation;
	@Column
	private int cpt;
	@Column
	private int passingyear;
	@Column
	private int yeargap;
	@Column
	private int workexperience;
	public Student() {
		super();
	}
	public Student(int id, String firstName, String middleName, String lastName, String colony, String city,
			String state, int pincode, int contactNo, String emailid, int candidateid, String gender, Date dateOfBirth,
			float ssc, float hhc, float graduation, float postgraduation, int cpt, int passingyear, int yeargap,
			int workexperience) {
		super();
		this.id = id;
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		Colony = colony;
		City = city;
		State = state;
		Pincode = pincode;
		ContactNo = contactNo;
		Emailid = emailid;
		Candidateid = candidateid;
		Gender = gender;
		DateOfBirth = dateOfBirth;
		this.ssc = ssc;
		this.hhc = hhc;
		this.graduation = graduation;
		this.postgraduation = postgraduation;
		this.cpt = cpt;
		this.passingyear = passingyear;
		this.yeargap = yeargap;
		this.workexperience = workexperience;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getColony() {
		return Colony;
	}
	public void setColony(String colony) {
		Colony = colony;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public int getContactNo() {
		return ContactNo;
	}
	public void setContactNo(int contactNo) {
		ContactNo = contactNo;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public int getCandidateid() {
		return Candidateid;
	}
	public void setCandidateid(int candidateid) {
		Candidateid = candidateid;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public float getSsc() {
		return ssc;
	}
	public void setSsc(float ssc) {
		this.ssc = ssc;
	}
	public float getHhc() {
		return hhc;
	}
	public void setHhc(float hhc) {
		this.hhc = hhc;
	}
	public float getGraduation() {
		return graduation;
	}
	public void setGraduation(float graduation) {
		this.graduation = graduation;
	}
	public float getPostgraduation() {
		return postgraduation;
	}
	public void setPostgraduation(float postgraduation) {
		this.postgraduation = postgraduation;
	}
	public int getCpt() {
		return cpt;
	}
	public void setCpt(int cpt) {
		this.cpt = cpt;
	}
	public int getPassingyear() {
		return passingyear;
	}
	public void setPassingyear(int passingyear) {
		this.passingyear = passingyear;
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
		return "student [id=" + id + ", FirstName=" + FirstName + ", MiddleName=" + MiddleName + ", LastName="
				+ LastName + ", Colony=" + Colony + ", City=" + City + ", State=" + State + ", Pincode=" + Pincode
				+ ", ContactNo=" + ContactNo + ", Emailid=" + Emailid + ", Candidateid=" + Candidateid + ", Gender="
				+ Gender + ", DateOfBirth=" + DateOfBirth + ", ssc=" + ssc + ", hhc=" + hhc + ", graduation="
				+ graduation + ", postgraduation=" + postgraduation + ", cpt=" + cpt + ", passingyear=" + passingyear
				+ ", yeargap=" + yeargap + ", workexperience=" + workexperience + "]";
	}	
	
	
	
}
