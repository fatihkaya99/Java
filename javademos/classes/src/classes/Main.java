package classes; // class, interface, abstract olayı syntax olarak değil tam ANLA!

//classın en temel özelliği gruplama yapıyoruz.reference types.Bellekte stack ve heap...Classı oluşturuken dikkat! Bellekte new pahalıdr
//garbage collector:Tutan kimse kalmadıysa çöpe gidebilirsin.

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// value
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		// primitive typeler değer tiplidir.Stack ve heap sonuç 10

		// reference
		int[] sayilar1 = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		// diziler= reference type iki değişken bir nesneyi tutuyor.2 stack 1 heape
		// ancak baş geliyor:)

	}

}
