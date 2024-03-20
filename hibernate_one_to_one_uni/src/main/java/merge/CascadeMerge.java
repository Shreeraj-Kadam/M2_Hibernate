package merge;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Pancard;
import entity_classes.Person;

public class CascadeMerge {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_one_uni");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p = em.find(Person.class, 2);
		Pancard pan = p.getPancard();
		p.setName("Prasad");
		pan.setDob("2-02-2000");
		
		et.begin();
		em.merge(p);
		et.commit();
		
		
	}
}
