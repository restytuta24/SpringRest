package package1.springFrameworkRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import package1.springFrameworkRest.DAO.EmployeesDAO;
import package1.springFrameworkRest.model.Employees;


@Service
public class EmployeesServiceImpli implements EmployeesService { // service communicates with the DAO, IOW, it calls the DAO methods. 
	
	@Autowired
	 private EmployeesDAO employeesDAO; // means we want to use the methods mentioned in EmployeesDAO

	@Override
	public void saveEmployees(Employees employees) {
		employeesDAO.saveEmployees(employees);
		
	}

	@Override
	public void updateEmployees(Employees employees) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployees(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employees getEmployeesById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
