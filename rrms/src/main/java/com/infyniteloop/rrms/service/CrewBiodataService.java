package com.infyniteloop.rrms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infyniteloop.rrms.model.CrewBiodata;
import com.infyniteloop.rrms.repository.CrewBiodataRepository;

@Service
public class CrewBiodataService {
	
	@Autowired
	private CrewBiodataRepository crewBiodataRepository;
	
	
	public List<CrewBiodata> getAllCrewBiodata()
	{
		List<CrewBiodata> biodata = new ArrayList<>();
		
		crewBiodataRepository.findAll().forEach(biodata::add);
		return biodata;
	}
	
	
	public CrewBiodata getCrewBiodata(String id)
	{
		return crewBiodataRepository.findById(id).get();
	}
	
	public void addCrewBiodata(CrewBiodata crewBiodata)
	{
		crewBiodataRepository.save(crewBiodata);
	}
	
	
	public void updateCrewBiodata(CrewBiodata crewBiodata)
	{
		crewBiodataRepository.save(crewBiodata);
	}
	
	
	public void deleteCrewBiodata(String id)
	{
		crewBiodataRepository.deleteById(id);
	}

}
