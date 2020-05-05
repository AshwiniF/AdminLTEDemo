package com.javabykiran.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.jbk.hibernate.Addnewuser;
import com.jbk.hibernate.Downloads;
import com.jbk.hibernate.Links;
import com.jbk.hibernate.Operator;
import com.jbk.hibernate.State;
import com.jbk.hibernate.Statemaster;
import com.jbk.hibernate.Users;

@Configuration
@PropertySource("classpath:application.properties")
@EnableAspectJAutoProxy
public class HibernateConfiguration {

	@Autowired
	private ApplicationContext context;

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		System.out.println(1111111);
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
		factoryBean.setAnnotatedClasses(Users.class, Addnewuser.class,State.class,Statemaster.class,Operator.class,Links.class);
		return factoryBean;
	}

}
