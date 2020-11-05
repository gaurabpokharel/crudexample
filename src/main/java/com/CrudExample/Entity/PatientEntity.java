package com.CrudExample.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PatientEntity {

	@Id
	@Column
	private int patientid;
	@Column
	private String patientfullname;
	@Column
	private String address;
	@Column
	private String phono;
	@Column
	private String gender;
	@Column
	private String email;
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientfullname() {
		return patientfullname;
	}
	public void setPatientfullname(String patientfullname) {
		this.patientfullname = patientfullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhono() {
		return phono;
	}
	public void setPhono(String phono) {
		this.phono = phono;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
