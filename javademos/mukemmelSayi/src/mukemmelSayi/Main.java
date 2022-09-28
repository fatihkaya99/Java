package mukemmelSayi;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// Hatırlayalım:Kendinden başka PBS toplamı kendine eşit olandır. 6-->1,2,3
		int number = 5 ;
		int total =0;
		 
		for (int i = 1; i < number; i++) {
			if (number % i ==0) {
				total = total +i;
			}
		}
		if (total== number) {
			System.out.println("Mükemmel sayıdır :)");
		}
		else {System.out.println("Üzgünüm mükemmel sayı değil!");}

	}

}
