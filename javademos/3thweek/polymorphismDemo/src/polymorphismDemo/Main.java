package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		/*
		 * BaseLogger [] loggers =new BaseLogger[] {new FileLogger(),new
		 * EmailLogger(),new DatabaseLogger(), new ConsoleLogger()};
		 *  for (BaseLogger logger : loggers) { logger.log("Log mesajı");
		 * 
		 * }
		 */
		CustomerManager customManager = new CustomerManager(new DatabaseLogger());
		customManager.add();

	}

}
//çok biçimlilik referans tiplerinin birbirlerinin referansını tutması //loglama yöntemi
//overriding üstüne yazma