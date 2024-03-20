package update_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_demo.Employee;

public class MergeDemo {
 public static void main(String[] args) {
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee emp1 = new Employee(1, "Shubham Kumar", 50000);
		Employee emp2 = em.find(Employee.class, 2);
		emp2.setName("Kiran Kumar");
		emp2.setSalary(60000);
		et.begin();
		em.merge(emp1);
		em.merge(emp2);
		et.commit();
		
}
}
