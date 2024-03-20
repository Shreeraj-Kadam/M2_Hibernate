package entity_classes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person1 {
	@Id
	private int id;
	private String name;
	private long phone;
	
	@OneToOne
	@JoinColumn
	private Pancard1 pancard;
	
	public Person1() {
		// TODO Auto-generated constructor stub
	}

	public Person1(int id, String name, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Pancard1 getPancard() {
		return pancard;
	}

	public void setPancard(Pancard1 pan) {
		this.pancard = pan;
	}

	@Override
	public String toString() {
		return "Person1 [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	
}
