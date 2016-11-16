package vn.smartdev.springpointcut.man;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import vn.smartdev.springpointcut.service.EmployeeService;

public class SpringMain {

	public static void main (String[]args){
		ClassPathXmlApplicationContext ctx = new 
				ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = (EmployeeService)ctx.getBean("employeeService",EmployeeService.class);
		
		System.out.println(employeeService.getEmployee().getName());

		employeeService.getEmployee().setName("Pankaj");
		employeeService.getEmployee().throwException();

		ctx.close();
	}
}


