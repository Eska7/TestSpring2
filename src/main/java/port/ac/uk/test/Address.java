package port.ac.uk.test;

public class Address {
	private String street, postcode;

	public Address(String street, String postcode) {
		this.street = street;
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}
	
}
