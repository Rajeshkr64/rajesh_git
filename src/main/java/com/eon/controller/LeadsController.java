package com.eon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eon.entities.Leads;
import com.eon.services.LeadsService;

@Controller
public class LeadsController {
	
	@Autowired
	private LeadsService leadsService;//Step 8- To call this for service layer
	
	
@RequestMapping("/lead") // Step 3- To connect with lead JSP page
	public String showLeadsPage() {
		return "leads";
	}
@RequestMapping("/saveLead")
public String saveLead(@ModelAttribute("lead") Leads lead, ModelMap modelMap) { //Step 4- to save the lead data and send to service layer and model map will show the data in leadsInfo page
	leadsService.saveLead(lead);
	modelMap.addAttribute("lead", lead); // Model attribute help to read the data from lead JSP page
	return"leadsInfo";
}
  @RequestMapping("/getleads")
  public String getAllLeads(ModelMap modelMap) { //step 14- To show all leads details
	  List<Leads> leads = leadsService.getLeads();
	  modelMap.addAttribute("leads", leads);
	  return "leadsSearchResults";
  }


}
