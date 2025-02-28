package package1.springFrameworkRest.service;

import java.util.List;

import package1.springFrameworkRest.DAO.EmployeesDAO;
import package1.springFrameworkRest.model.Employees;


public interface EmployeesService {
	
	 // Method to save a customer
	   public void saveEmployees(Employees employees);

	    // Method to update an existing customer
	   public void updateEmployees(Employees employees);

	    // Method to delete a customer by ID
	   public void deleteEmployees(int id);

	    // Method to get a customer by ID
	   Employees getEmployeesById(int id);

	    // Method to get all customers
	    List<Employees> getAllEmployees();

}
