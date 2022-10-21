package overriding;

public class OgrenciKrediManager extends BaseKrediManager { // overridable üzerine yazılabilir miras aldığı sınıfı ezdi
	// final ile base beslersen ezemezler!!!
	public double hesapla(double tutar) {
		return tutar * 1.10;
		// c# virtual operasyonlar
		
		//abstract sınıflar (soyut) klaslarla yapısal anlamda farkı yok kullanım farkı var.Başka bir sınıfı inherite eder.( görevi türeyecek classlara kalıtım vermek.)
	}

}
