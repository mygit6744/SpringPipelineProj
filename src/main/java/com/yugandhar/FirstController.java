package com.yugandhar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstController {
	
	@GetMapping("/") 
    public String getMessage()
    {
        return "Welcome to Employee Management System";
    }
	@GetMapping("/emps")
	public List<Employee> getHerosList() {

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("1", "Valteru veeraiah","BFSI","HYD",30));
		emp.add(new Employee("2", "Laksmi","HR","HYD",23));
		emp.add(new Employee("3 Prasad", "Kobbari bondam","RMG","HYD",26));
		emp.add(new Employee("4", "Maga Dheera","MANF","HYD",45));
		emp.add(new Employee("5", "Pushpa","BFSI","HCT",54));
		emp.add(new Employee("6", "Yama gola","BFSI","BFSI",34));
		return emp;

	}

}
