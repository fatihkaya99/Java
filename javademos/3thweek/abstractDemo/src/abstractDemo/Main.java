package abstractDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new OracleDatabaseManager();//konfigurasyon tarafında bunu anlarsan sorun çekmezsin
		customerManager.getCustomers();//bağımlılık yönetimi araçları ile de yönetilir.(dependency injection)
		
		

	}

}
