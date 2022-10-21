package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		//abstractlar tek başına kullanılamaz 
		GameCalculator  gameCalculator = new WomanGameCalculator();//oyuna yeni özellik eklemek istiorsun

	}

}
