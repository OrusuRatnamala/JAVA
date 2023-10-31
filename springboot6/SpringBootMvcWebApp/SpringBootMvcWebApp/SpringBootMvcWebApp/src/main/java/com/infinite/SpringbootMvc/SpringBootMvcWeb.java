package com.infinite.SpringbootMvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)

public class SpringBootMvcWeb {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcWeb.class, args);
	}

}
