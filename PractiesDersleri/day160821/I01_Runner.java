package day160821;

public class I01_Runner {

	public static void main(String[] args) {
		/* sınıf oluşturacağız bu örneğimizde: Runner ,calisan ve yonetici sınıfları. 
		 * Calışan sınıfımız superclass, yonetici sınıfımız da subclass olacak. 
		 * Runner sınıfımızı da oluşturduğumuz kodları, konsola yazdırabilmek için oluşturacağız
			Çalışan sınıfınfa isim ,maas ve departman değişkenleri olsun.
			Parmetresi bu değişkenler olan bir constructor oluşturalım.
			Birde bu değişkenleri görüntüleyecek bir BilgileriGoster methodu oluşturalım.
			Yönetici sınıfında yine parametresi SperClasstaki değişkenler olan bir constructor oluşturalım.
			Birde parametresi int zam olan br method oluşturalım. 
			Bu method bize zam miktarı belirtildiğinde ne kadar zam yapılması gerektiğini belirtsin.
		 
		 */
		
		I01_Yonetici yonetici= new I01_Yonetici("Basri",10000,"IT");
		yonetici.bilgileriGoster();
		yonetici.zamMiktari(500);

	}

}
