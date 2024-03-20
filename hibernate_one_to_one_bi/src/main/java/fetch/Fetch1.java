package fetch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Pancard1;
import entity_classes.Person1;

public class Fetch1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_one_bi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person1 p = em.find(Person1.class, 1);
		Pancard1 pan = p.getPancard();		
		System.out.println(p);
		System.out.println(pan);
		
		Pancard1 pan1 = em.find(Pancard1.class, 102);
		Person1 p1 = pan1.getPerson();
		System.out.println(pan1);
		System.out.println(p1);
	}
}
