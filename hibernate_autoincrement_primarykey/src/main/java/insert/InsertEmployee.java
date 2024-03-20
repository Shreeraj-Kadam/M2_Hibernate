package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Employee;

public class InsertEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("auto_increment");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee e1 = new Employee("Shubham", 100);
		Employee e2 = new Employee("Abhishek", 200);
		Employee e3 = new Employee("Pratap", 300);
		
		et.begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		et.commit();
	}
}
