package package1.springFrameworkRest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestingRest {
	
	@Id
	private int id;
	private String name;
	private int age;
	
		
	public TestingRest() {
		super();
	}


	public TestingRest(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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


	@Override
	public String toString() {
		return "TestingRest [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
