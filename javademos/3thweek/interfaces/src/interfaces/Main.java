package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDao());
		//customerManager.customerDao=new MySqlCustomerDao();
		customerManager.add();		
		
	

	}

}






//referans tutma olayı class ve abstract benzer
//klaslarda tüm olaylar tanımlanmış abstractta onu inherit eden içini dolduruyordu.
//interface operasyonların içerisinde tamamlanmamış operasyonlar içerir.
//arayüz<iş<dataaccess katman geçişleri interfacelerle //nedeni bağımlılık önleme
//!!!!interface newlenmez ve imza taşırlar 
//interfacede implementasyondur.extend değil
//implemtansyon bir klas birden fazla interface implemente eder
/// extend bir tane klas edilebilir
