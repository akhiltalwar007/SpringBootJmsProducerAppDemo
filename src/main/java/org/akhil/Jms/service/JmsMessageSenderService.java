package org.akhil.Jms.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
@Component
public class JmsMessageSenderService implements CommandLineRunner {
	
	@Autowired
	private JmsTemplate jt;
	
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Message Sending ....");
		
		jt.send("MyQueue1", (session) ->
			session.createTextMessage("HELLO PROM PROODUCER...!!!" + new Date())
		);
		
		System.out.println("MESSAGE SENT .... !!!!");
	}

}
