package com.javabykiran.config;

import java.util.concurrent.TimeUnit;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.CacheControl;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.javabykiran.logger.LogginAspect;

@Configuration
@EnableWebMvc
@ComponentScan("com.javabykiran")
@EnableScheduling
@EnableAsync
@EnableAspectJAutoProxy
public class WebConfiguration implements WebMvcConfigurer {
	@Bean
	public InternalResourceViewResolver myresolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/admin/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	
	  @Bean public LogginAspect myAOPObject() 
	  { return new LogginAspect();
	  
	  }
	 

	 @Override
	   public void addResourceHandlers(ResourceHandlerRegistry registry) {

	      // Register resource handler for CSS and JS
	      registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/resources/")
	            .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
	      
	      // Register resource handler for images
	      registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/")
          .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
 }
	      
	 

	// every midnight take emails from database
	// for those having birthdate today
	//@Scheduled(cron = "*/10 * * * * *")
	//public void sendBirthdayWishes() {
	//	System.out.println("db code");
		// rows check if any row increased then take out
		// that email id and send email
		// users table uid uname passwd / birthdate//email
		// 10 user
		// 11 user
		// welcome email
	//	System.out.println("email  code");
	//}

}
