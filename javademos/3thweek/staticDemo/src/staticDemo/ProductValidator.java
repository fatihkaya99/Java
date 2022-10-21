package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Statik yapıcı blok çalıştı");
	}
	
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {// iş empty değer girilmedi

			return true;
		} else {
			return false;

		}
		

	}
	public void bisey() {
		
	}
	/*public  static class BaskaBirClass() {//inner class
		public static void Sil() {
			
		}
		
	}*/

}

//static kullanım uygulamaların içinde utility araç varken kullanırız
	// kullanım amacı ürünü kaydederken güncellerken kurallara uygun mu?
//static tanımladığınızda uygulama sıfırlanıncaya kadar bellekte kalır!Kullan bırak araçlar 
//metotu static yaptığınızda klas ismiyle direk çağrılır
//c# yapıcı blok staticte de çalışır.Burda çalışmıyo