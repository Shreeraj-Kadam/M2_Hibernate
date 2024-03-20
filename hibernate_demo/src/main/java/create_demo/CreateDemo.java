package create_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernate_demo.Employee;

public class CreateDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//Employee emp1 = new Employee(1, "Shubham", 20000);
		//Employee emp2 = new Employee(2, "Kiran", 30000);
		Employee emp3 = new Employee(3, "Ganesh", 40000);
		
		et.begin();
		
		//em.persist(emp1);
		em.persist(emp3);
		et.commit();
		em.persist(emp3);
		System.out.println("Data Inserted");
		
	}
}
