package methods2;

public class Main {

	public static void main(String[] args) {
		// write your code here
		// void operation emir kipi gibi// değeri return eden methodları göstercez.
		String mesaj = "Bugün hava çok güzel";
		// String yeniMesaj = mesaj.substring(0, 2);
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5, 7);
		System.out.println(sayi);
		int toplam = topla2(1, 3, 4, 5, 10);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi");

	}

	public static void sil() {
		System.out.println("Silindi");

	}

	public static void güncelle() {
		System.out.println("Güncellendi");

	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;

	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;

		}
		return toplam;

	}

	public static String sehirVer() {
		return "Ankara";
	}

	// koleksiyonlar ve nesnel yapılar test edilebilirliği daha iyi

}
