package org.akhil.Jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootJmsProducerAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJmsProducerAppDemoApplication.class, args);
	}

}
