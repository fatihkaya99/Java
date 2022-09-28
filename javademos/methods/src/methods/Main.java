package methods;

public class Main {

	public static void main(String[] args) {// daha efektif fonksiyon

		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;

			}
		}
		String mesaj = "";
		if (varMi) {
			mesajVer("Sayı mevcuttur:  " + aranacak);
			mesajVer(mesaj);
		}

		else {
			mesajVer("Sayı mevcut değildir:  " + aranacak);
			// System.out.println("Sayı mevcuttur: " + aranacak);
		}
	}

	public static void mesajVer(String mesaj)// (int aranacak)// parametreli method
	{
		System.out.println(mesaj);

	}
	// reusability

}
