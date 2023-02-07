package com.luv2code.springdemo.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CRMLoggingAspect {

	// setup logger
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	// setup pointcut declaration
	@Pointcut("execution(* com.luv2code.springdemo.controller.*.*.(..))")
	private void forControllerPackage() {}
	
	// setup service pointcut declaration
	@Pointcut("execution(* com.luv2code.springdemo.service.*.*.(..))")
	private void forServicePackage() {}
	
	// setup dao pointcut declaration
	@Pointcut("execution(* com.luv2code.springdemo.dao.*.*.(..))")
	private void forDAOPackage() {}
	
	@Pointcut("forControllerPackage() || forServicePackage() || forDAOPackage()")
	private void forAppFlow() {}
	
	// add @Before advice
	
	
	// add @After advice
	
	
	
	
	
	
}
