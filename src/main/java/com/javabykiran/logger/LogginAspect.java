package com.javabykiran.logger;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {
	
	Logger logger1=Logger.getLogger(getClass().getName());
	
	public LogginAspect() {
		System.out.println("I am in Constructor");
	}
	
	@Pointcut(value="execution(* com.javabykiran.controller.*.*(..))")
	private void getcontroller()   
	{   
	} 
	
	@Pointcut(value="execution(* com.javabykiran.service.*.*(..))")
	private void getservice()   
	{ 
		
	} 
	
	@Pointcut(value="execution(* com.javabykiran.dao.*.*(..))")
	private void getdao()   
	{ 
		
	}
	@Around("getcontroller()||getservice()||getdao()")
	public Object aroundAdvice(ProceedingJoinPoint jp) throws Throwable   {
			
			String method=jp.getSignature().getName();
			
			long start=System.currentTimeMillis();
			
			Date date=new Date(start);
			
			logger1.info("started calling " +method + " at " + date+ ".");
			logger1.info("exiting calling " +method + " at " + date+ ".");
			
			Object rs=null;
			
		  
		try   
		{  
		rs=jp.proceed();
		
		}   
		catch (Exception e) {
			e.printStackTrace();
		}
	        return rs;  
		}
	
}
