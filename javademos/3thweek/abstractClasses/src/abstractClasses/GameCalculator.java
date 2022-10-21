package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla(); //kim inherit ediyorsa hesaplayı override etmeli
	
	
	public void gameOver() {
		System.out.println("Oyun bitti");
		
	}

}
