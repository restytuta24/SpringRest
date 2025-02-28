package package1.springFrameworkRest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
	
	@Id
	private int id;
	private String name;
	private int age;
	private String department;
	
	public Employees(int id, String name, int age, String department) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
	}

	public Employees() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + "]";
	}
	
	
	
	
	

}
