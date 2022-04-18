package com.eon.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eon.entities.Leads;
import com.eon.repositories.LeadsRepository;

@Service
public class LeadsServiceImpl implements LeadsService {
    
	@Autowired
	private LeadsRepository leadsRepo; //Step 6- To save the data in database by service layer through repository 
	
	@Override
	public void saveLead(Leads lead) { // Step 7- Actually save leads data in database
    leadsRepo.save(lead);
	}

	@Override
	public List<Leads> getLeads() { // step 15- To show leads details in getleads page
		List<Leads> leads = leadsRepo.findAll();
		return leads;
	}

}
