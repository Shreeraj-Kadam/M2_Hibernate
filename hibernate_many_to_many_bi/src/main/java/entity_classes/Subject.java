package entity_classes;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
	private int id;
	private String name;	
	
	@ManyToMany(mappedBy = "subjects")
	private List<Student> students;
	
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Subject() {
		// TODO Auto-generated constructor stub
	}

	public Subject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	
}
