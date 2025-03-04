package package1.springFrameworkRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import package1.springFrameworkRest.DAO.EmployeesDAO;
import package1.springFrameworkRest.model.Employees;


@Service
public class EmployeesServiceImpli implements EmployeesService { // service communicates with the DAO, IOW, it calls the DAO methods. 
	
	@Autowired
	 private EmployeesDAO employeesDAO; // means we want to use the methods mentioned in EmployeesDAO

	@Override
	@Transactional
	public void saveEmployees(Employees employees) {
		employeesDAO.saveEmployees(employees);
		
	}

	@Override
	@Transactional
	public void updateEmployees(Employees employees) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void deleteEmployees(int id) {
		employeesDAO.deleteEmployees(id);
		
	}

	@Override
	@Transactional
	public Employees getEmployeesById(int id) {
		return employeesDAO.getEmployeesById(id);
	}

	@Override
	@Transactional
	public List<Employees> getAllEmployees() {
		return employeesDAO.getAllEmployees();
	}

	
}
