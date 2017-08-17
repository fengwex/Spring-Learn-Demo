package com.spring.learn.test.advisor;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodInterceptor implements MethodBeforeAdvice {
	
	public void before(Method method, Object[] arg1, Object arg2)
			throws Throwable {
		if(method.getName().equals("add1")){
			System.out.println("奐膿。。。。。。。。。。。");
		}
	}

}
