package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Pancard;
import entity_classes.Person;

public class Demo {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_one_uni");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Pancard pan = new Pancard(101, "Maharashtra", "1-01-1995");
//		Person p = new Person(1, "Shubham" , 1111, pan);					
//		et.begin();
//		em.persist(p);
//		et.commit();
		
//		Person p = em.find(Person.class, 1);
//		p.setPhone(2222);
//		p.getPancard().setAddress("Mumbai");
//		
//		et.begin();
//		em.persist(p);
//		et.commit();
//		
		
		
		

		
		
	}
}
