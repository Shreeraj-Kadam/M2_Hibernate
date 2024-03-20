package insert;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.Author;
import entity_classes.Book;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_many");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Book b1 = new Book(101, "Book1", 1000);
		Book b2 = new Book(102, "Book2", 3000);
		Book b3 = new Book(103, "Book3", 5000);
		
		List<Book> books1 = new ArrayList<Book>();
		books1.add(b1);
		books1.add(b2);
		
		List<Book> books2 = new ArrayList<Book>();
		books2.add(b3);
		
		Author a1 = new Author(1, "Shubham", books1);
		Author a2 = new Author(2, "Prasad", books2);
		
		et.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		et.commit();
	}
}
