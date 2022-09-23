package Lesson2Examples.classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product=new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Lenovo Laptop");
		product.setPrice(7500);
		product.setStockAmount(250);
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);

	}

}
