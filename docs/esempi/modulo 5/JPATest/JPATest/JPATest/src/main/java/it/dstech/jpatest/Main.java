package it.dstech.jpatest;

public class Main {

	public static void main(String[] args) {

		Address address = new Address();
		
		address.setCity("Dhaka");
		address.setCountry("Bangladesh");
		address.setPostcode("9");
		address.setStreet("Poribagh");

		ServicesCrud crud_services = new ServicesCrud("jpa-example");

		// Creazione record in tabella
		crud_services.jpaCreate(address);

		crud_services.closeLogicaJPA();
	}
}
