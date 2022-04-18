package com.eon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eon.utilities.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService; // To call the email service layer
	

	@RequestMapping("/sendEmail") // step 10- to connect with the send email page
	public String sendEmail(@RequestParam("email") String email, ModelMap modelMap) { // request param means which parameter you wants to read as here it is email which input type is hidden
       modelMap.addAttribute("email", email);// it will show the email
		return "compose";
	}
		
		@RequestMapping("/triggerEmailSending") // step 11- After clicking send the email button and it's goes to service layer 
		public String triggerEmailSending(@RequestParam("email") String email, @RequestParam("subject") String subject, @RequestParam("message") String message, ModelMap modelMap) {
		emailService.sendSimpleMessage(email, subject, message)	;
		modelMap.addAttribute("msg", "Email Sent!!"); //To remain in same page and show this message
		return"compose";
		}
}

