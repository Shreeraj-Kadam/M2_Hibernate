package merge;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_class.Employee;

public class Merge {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("annotation");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Employee emp = em.find(Employee.class, 1);
		emp.setName("Shubham Kumar");
		
		et.begin();
		em.merge(emp);
		et.commit();
	}
}
