package port.ac.uk.test;

public class Person {

	private int id;
	private String name;
	
	private Address address;
	private int tuxId;
	
	public Person(){
		
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void speak() {
		System.out.println("Hello");
	}

	public void setTuxId(int tuxId) {
		this.tuxId = tuxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address
				+ ", tuxId=" + tuxId + "]";
	}
	
	
}
