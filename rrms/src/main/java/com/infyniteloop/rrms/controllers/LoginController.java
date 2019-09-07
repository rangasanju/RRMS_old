package com.infyniteloop.rrms.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infyniteloop.rrms.model.CrewBiodata;
import com.infyniteloop.rrms.model.User;
import com.infyniteloop.rrms.service.CrewBiodataService;

@RequestMapping("/data")
@RestController
@CrossOrigin 
public class LoginController {
	
	@Autowired
	private CrewBiodataService CrewBiodataService;

	
	
	@GetMapping(produces = "application/json")
	@RequestMapping({ "/validateLogin" })
	public User validateLogin() {
		System.out.println("User successfully authenticated");
		return new User("User successfully authenticated");
	}
	
	
	// Get all Biodata
		@RequestMapping("/biodata/all")
		public List<CrewBiodata> getAllBiodata() {
			return CrewBiodataService.getAllCrewBiodata();
		}
		
		
	// Get a single Biodata
	@RequestMapping("/biodata/{id}")
	public CrewBiodata getBiodata(@PathVariable String id) {
		return CrewBiodataService.getCrewBiodata(id);
	}
	
	// Add anew Biodata
	@RequestMapping(method=RequestMethod.POST, value="/biodata")
	public void addBiodata(@RequestBody CrewBiodata crewBiodata) {
		
		System.out.println("Calling POST ....");
		CrewBiodataService.addCrewBiodata(crewBiodata);
	}
	
	// Update Biodata
	@RequestMapping(method=RequestMethod.PUT, value="/biodata")
	public void updateBiodata(@RequestBody CrewBiodata crewBiodata) {
		CrewBiodataService.updateCrewBiodata(crewBiodata);
	}
	
	// Delete a Biodata
	@RequestMapping(method=RequestMethod.DELETE, value="/biodata/{id}")
	public void deleteBiodata(@PathVariable String id) {
		CrewBiodataService.deleteCrewBiodata(id);
	}

//	@PreAuthorize("hasAnyRole('ADMIN')")
//	@GetMapping("/secured/all")
//	public String securedHello() {
//		return "Secured Hello";
//	}



}
