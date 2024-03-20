package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_class.Employee;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cache");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee e1 = new Employee(1, "Shubham", 100);
		Employee e2 = new Employee(2, "Prasad", 200);
		
		et.begin();
		em.persist(e1);
		em.persist(e2);
		et.commit();
		
	}
}
