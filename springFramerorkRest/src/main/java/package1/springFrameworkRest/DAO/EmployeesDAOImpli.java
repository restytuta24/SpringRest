package package1.springFrameworkRest.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import package1.springFrameworkRest.model.Employees;

@Repository
public class EmployeesDAOImpli implements EmployeesDAO { // the DAO class communicates directly with the database.
	
	@Autowired	
	 private SessionFactory sessionFactory;

	@Override
	public void saveEmployees(Employees employees) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(employees);
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

	