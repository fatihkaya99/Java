package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger; // attribute

	public CustomerManager(BaseLogger logger) {// İleride unutursan!!source->generate *constructor* using fields

		this.logger = logger;
	}

	public void add() {
		System.out.println("Müşteri eklendi");
		//DatabaseLogger logger = new DatabaseLogger(); // new pahalı,bağımlı onun yerine private
		logger.log("Log mesajı");
	}

}
