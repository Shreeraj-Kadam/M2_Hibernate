package remove;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Pancard1;
import entity_classes.Person1;

public class Remove1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_one_bi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		// remove the pancard with id 102
		
		Pancard1 pan = em.find(Pancard1.class, 102);
		Person1 p = pan.getPerson();
		p.setPancard(null);
		
		et.begin();
		em.merge(p);
		em.remove(pan);
		et.commit();
		
	}
}
