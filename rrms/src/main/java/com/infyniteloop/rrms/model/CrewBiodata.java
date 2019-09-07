package com.infyniteloop.rrms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CrewBiodata")
public class CrewBiodata {
	
	@Id
	@Column(name = "crew_id_v")
    private String crewid;
	
	@Column(name = "first_name_v")
    private String firstName;
	
	@Column(name = "last_name_v")
    private String lastName;
	
	@Column(name = "desig_v")
    private String designation;

	
	
	

	public CrewBiodata() {
		
	}

	
	
	public CrewBiodata(String crewid, String firstName, String lastName, String designation) {
		super();
		
		this.crewid = crewid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
	}

	
	public String getCrewid() {
		return crewid;
	}

	public void setCrewid(String crewid) {
		this.crewid = crewid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
