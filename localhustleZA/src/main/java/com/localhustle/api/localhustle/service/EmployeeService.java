/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.localhustle.api.localhustle.service;

import com.localhustle.api.localhustle.model.Employee;
import java.util.List;

/**
 *
 * @author wanda kaak
 */
public interface EmployeeService {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id); 
}
