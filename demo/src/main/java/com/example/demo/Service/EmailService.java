package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

		@Autowired
		private JavaMailSender javaMailSender;
		
		public void sendEmail(String email) {
			SimpleMailMessage message= new SimpleMailMessage();
			message.setFrom("ashinde373.as@gmail.com");
			message.setTo(email);
			message.setSubject("Registration mail");
			message.setText("Welcome");
			javaMailSender.send(message);
			System.out.println("Mail sent");
		}
}
