package fetch;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Student;
import entity_classes.Subject;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("many_to_many_uni");
		EntityManager em = emf.createEntityManager();
		
		Student stud = em.find(Student.class, 1);
		System.out.println(stud);
		List<Subject> subjects = stud.getSubjects();
		
		for(Subject s : subjects) {
			System.out.println(s);
		}
		
	}
}
