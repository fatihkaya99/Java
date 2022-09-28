package classesWithAttributes;

public class ProductManager {
	public void Add(Product product)
	// JDBC database
	{
		System.out.println("Ürün eklendi: " + product.name);
	}

	public void Add2(int id, String name, String description, double price, int stockAmount) {

	}
}
