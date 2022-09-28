package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus", 5000, 2, "Siyah");
		/*
		 * Product product =new Product(); product.setName("Laptop"); product.setId(1);
		 * product.setPrice(5000); product.setDescription("Asus");
		 * product.setStockAmount(3); product.setRenk("");
		 */

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getKod());

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// productManager.Add2(0, null, null, 0, 0);encapsultion neden kullanılıyor??her
		// değişiklikte yeniden yeniden düzenlememek

		// System.out.println(product.name);

	}

}
