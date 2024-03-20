package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_class.Employee;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("annotation");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee emp1 = new Employee(1, "Shubham", 30000);
		Employee emp2 = new Employee(2, "Prasad", 22000);
		
		et.begin();
		em.persist(emp1);
		em.persist(emp2);
		et.commit();
		
		
	}
}
