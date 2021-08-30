package _14_Override._03;

public class Isci extends Personel {
	
	
	public String bolum="Kaynak Atolyesi";
    public int maas=5000;
    public String isim = "Mesut";
    
    public int maasHesapla() {
        return 30*8*15; // 30 gun sayisi, 8 gunluk mesai,15 saat ucreti
    }
    
    public void mesai() {
        System.out.println("isciler gunluk 8 saat calisir");
    }
    
    
	
    // overloading : ayn� isimde ama farkl� method signaturelar�na sahip metodlar
	
    public int maasHesapla(int gunSayisi) {
    	
    	return gunSayisi*8*15;
    }
        public int maasHesapla(int gunlukCalismaSaati,int gunSayisi) {
        	
        	return gunSayisi*gunlukCalismaSaati*15; 	
        }
        
        public int maasHesapla(int gunlukCalismaSaati,int gunSayisi, int saatUcreti) {
        
        return gunlukCalismaSaati*gunSayisi*saatUcreti;
        }
}
