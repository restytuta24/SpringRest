package package1.springFrameworkRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import package1.springFrameworkRest.model.Employees;
import package1.springFrameworkRest.service.EmployeesService;

@RestController
public class EmployeesController {
	
	@Autowired
	EmployeesService employeesService; // this class is autowired inorder to use its methods. we use the autowired annotation instead of the old mthods of using objects to call methods of a cartain class.
	
	@RequestMapping (value = "/muyengabranch", method = RequestMethod.POST)
	public Employees saveEmployees(@RequestBody Employees employees) {
		employeesService.saveEmployees(employees);
		return employees;
		
	}
	
	@RequestMapping (value = "/currentList", method = RequestMethod.POST)
	public List<Employees> getAllEmployees(){
		List<Employees> myKaList = employeesService.getAllEmployees();
		return myKaList;
	}
	
	@RequestMapping (value = "/thisId/{id}", method = RequestMethod.GET)
	public Employees getEmployeesById(@PathVariable("id") int id) {
		Employees staff = employeesService.getEmployeesById(id);
		return staff;
		
	}
	
	@RequestMapping (value = "/deletedemployee/{id}", method = RequestMethod.DELETE)
	public String deleteEmployees(@PathVariable("id")  int id) {
		employeesService.deleteEmployees(id);
		return "you've succesfuly deleted one entry";
	}
	
	
	
	

}
