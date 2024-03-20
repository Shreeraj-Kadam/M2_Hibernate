package entity_class;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	int id;
	
	@Column(nullable = false)
	String name;
	
	@Column(updatable = false)
	int age;
	
	@Column(insertable = false)
	String company_name;
	
	@Column(unique = true)
	long phone;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age, String company_name, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.company_name = company_name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", company_name=" + company_name + ", phone="
				+ phone + "]";
	}
	
	
	
	
}
