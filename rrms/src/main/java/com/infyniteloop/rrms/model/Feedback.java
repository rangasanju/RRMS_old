package com.infyniteloop.rrms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="Feedback_Mst")
public class Feedback {

	@Id
	@Column(name="crew_id_v")
	@NotBlank
	private String crewid;
	
	@Column(name="email_v")
	@NotBlank
	@Email
	private String email;
	
	@Column(name="feedback_v")
	@NotBlank
	@Size(min=10)
	private String feedback;
	

	public Feedback() {
		
	}

	

	public Feedback(String crewid, String email, String feedback) {
		super();
		this.crewid = crewid;
		this.email = email;
		this.feedback = feedback;
	}

	public String getCrewid() {
		return crewid;
	}

	public void setCrewid(String crewid) {
		this.crewid = crewid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}



	@Override
	public String toString() {
		return "Feedback [crewid=" + crewid + ", email=" + email + ", feedback=" + feedback + "]";
	}
	
	
	
	
	
	
	
}
