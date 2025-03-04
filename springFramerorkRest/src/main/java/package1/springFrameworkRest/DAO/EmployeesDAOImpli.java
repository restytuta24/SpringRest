package package1.springFrameworkRest.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import package1.springFrameworkRest.model.Employees;




@Repository
public class EmployeesDAOImpli implements EmployeesDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveEmployees(Employees employees) {
		Session session = sessionFactory.openSession();
		session.save(employees);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployees(Employees employees) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployees(int id) {
	Session session = sessionFactory.openSession();
	Employees employees = (Employees) session.get(Employees.class, new Integer(id));
	if(null != employees) {
		session.delete(employees);
	}
		
	}

	@Override
	public Employees getEmployeesById(int id) {   
		Session session = sessionFactory.openSession();
		Employees employees = (Employees) session.get(Employees.class, new Integer(id));
		return employees;
	}

	@Override
	public List<Employees> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	} // the DAO class communicates directly with the database.
	

}

	