package oop1;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setId(1);
		customer.setCustomerNumber("100");
		customer.setPhone("0555");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(2);
		individualCustomer.setCustomerNumber("101");
		individualCustomer.setFirstName("Taner");
		individualCustomer.setLastName("Barcn");
		individualCustomer.setTc("12345678900");
		individualCustomer.setPhone("0555");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(3);
		corporateCustomer.setCustomerNumber("102");
		corporateCustomer.setCompanyName("Kodlama IO");
		corporateCustomer.setPhone("0555");
		corporateCustomer.setTaxNumber("1000000");

		Customer[] customers = { customer, individualCustomer, corporateCustomer };
		for (Customer customerArray : customers) {
			System.out.println(customerArray.getCustomerNumber());
		}

	}

}
