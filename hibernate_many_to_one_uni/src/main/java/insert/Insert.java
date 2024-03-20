package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Product;
import entity_classes.Review;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_one");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Product  p1 = new Product(1, "IPhone", 80000);
		Review r1 = new Review(101, 4.5, "Good Product", p1);
		Review r2 = new Review(102, 4.7, "Excellent", p1);
		
		Product  p2 = new Product(2, "Nokia", 10000);
		Review r3 = new Review(103, 1.7, "Poor", p2);
		Review r4 = new Review(104, 2.0, "Heat Quickly", p2);
		
		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(r1);
		em.persist(r2);
		em.persist(r3);
		em.persist(r4);
		et.commit();
		
				
	}
}
