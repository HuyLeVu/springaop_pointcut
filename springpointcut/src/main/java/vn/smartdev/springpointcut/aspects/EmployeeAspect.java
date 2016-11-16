package vn.smartdev.springpointcut.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {
	
	@Before("execution(public String getName())")
	public void getNameAdvice(){
		System.out.println("Executing Advice on getName()");
	}
	@Before("execution(* vn.smartdev.springpointcut.service.*.get*())")
	public void getAllAdvice(){
		System.out.println("Service method getter called");
	}
}