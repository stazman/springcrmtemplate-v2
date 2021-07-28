package com.dreamsourcer.springcrmtemplate2.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dreamsourcer.springcrmtemplatev2.dao.AccountConfig;
import com.dreamsourcer.springcrmtemplatev2.dao.AccountDAO;

public class AOPMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);

		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		theAccountDAO.addAccount();

		context.close();
		
	}

}
