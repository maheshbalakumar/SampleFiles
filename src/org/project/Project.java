package org.project;

import org.emp.Employee;

public class Project {
	public void projectName() {
		
		System.out.println("the project name is sourcinator");

	}
	public static void main(String[] args) {
		Project p = new Project();
		Employee e = new Employee();
		
		e.empName();
		p.projectName();
		
	}
	
	

}
