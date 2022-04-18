package com.eon.services;

import java.util.List;

import com.eon.entities.Leads;

public interface LeadsService { // Step 5- Service interface
	public void saveLead(Leads lead);

	public List<Leads> getLeads();

	

}
