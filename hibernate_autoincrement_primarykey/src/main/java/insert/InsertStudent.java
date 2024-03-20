package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Student;

public class InsertStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("auto_increment");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = new Student("Shuham", 70);
		Student s2 = new Student("Priya", 80);
		Student s3 = new Student("Prasad", 89);
		
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		et.commit();
		
	}
}
