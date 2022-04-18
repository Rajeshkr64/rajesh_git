package com.eon.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component // To purpose of @Componet is to tell Spring to maintain that class
public class EmailServiceImpl implements EmailService {
  
	@Autowired
    private JavaMailSender emailSender; // step 12- to send email through email API
	
	@Override
	public void sendSimpleMessage(String to, String subject, String text) { //step 13- To actually send the email     
		SimpleMailMessage message = new SimpleMailMessage(); 
        message.setTo(to); 
        message.setSubject(subject); 
        message.setText(text);
        emailSender.send(message);
	}

}
