package com.pavan.service;

import java.util.List;

import com.pavan.bean.Employee;
import com.pavan.dao.EmployeeDAO;

public class EmployeeService {

	public List<Employee> getEmployeeDetails(){
		EmployeeDAO employeeDAO = new EmployeeDAO();
    	return employeeDAO.getEmployeeByUsingHibernate();
	}

		
}
