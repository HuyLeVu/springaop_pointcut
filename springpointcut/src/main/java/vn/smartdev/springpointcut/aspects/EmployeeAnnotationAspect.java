package vn.smartdev.springpointcut.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {

	@Before("@annotation(vn.smartdev.springpointcut.aspects.Loggable)")
	public void myAdvice(){
		System.out.println("Executing myAdvice!!");
	}
}
