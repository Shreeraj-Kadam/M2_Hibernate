package insert;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Student;
import entity_classes.Subject;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_many_uni");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Subject sub1 = new Subject(101, "Physics");
		Subject sub2 = new Subject(102, "Chemistry");
		Subject sub3 = new Subject(103, "Math");
		Subject sub4 = new Subject(104, "Bio");
		
		List<Subject> subjects1 = new ArrayList<Subject>();
		subjects1.add(sub1);
		subjects1.add(sub2);
		subjects1.add(sub3);
		Student stud1 = new Student(1, "Shubham", 18, subjects1);
		
		List<Subject> subjects2 = new ArrayList<Subject>();
		subjects2.add(sub1);
		subjects2.add(sub2);
		subjects2.add(sub4);
		Student stud2 = new Student(2, "Prasad", 18, subjects2);

		
		et.begin();
		em.merge(sub1);
		em.merge(sub2);
		em.merge(sub3);
		em.merge(sub4);
		em.merge(stud1);
		em.merge(stud2);
		
		et.commit();
		
		
		
	}
}
