package practiesDersleri;
import java.util.Arrays;
public class C345Agustos {
    @SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();//bos bir sb1 creat ettik. 16 capacty
        //SB e eleman ekleme-->obj.appent(obj);
        sb1.append("faruk");
        System.out.println("sb1 ilk hali : "+sb1);//faruk 
        sb1.append(" efehan");
        System.out.println("sb1 efehan eklenmis hali : "+sb1);//faruk efehan
        System.out.println("sb1 uzunluk :"+sb1.length());//12
        System.out.println("sb1 kapasitesi :"+sb1.capacity());//16
        System.out.println("sb1 son hali :"+sb1.append(" guzel insan"));
        System.out.println("sb1 son hali. kapasite : "+sb1.capacity());
        
        //faruk efehan guzel insan
        //Fazladan ayrılan kapasiteyi silme -->obj.trimToSize();
        sb1.trimToSize();
        System.out.println(sb1.capacity());//24
        
        
        // istenen charakterin index ini alma -->obj.indexOf();
        System.out.println(sb1.indexOf("e")); //6
        System.out.println(sb1.lastIndexOf("e"));//16
        
        //İstenen bir characteri index'ine gore alma --> obj.charAt();      
        System.out.println("sb 7. karakter : "+sb1.charAt(7));//f
        
        
        //belirli bir araliktaki characterleri alma -->obj.subSsequence();
        
    System.out.println("sb 'nin 7 dahil 12 haric karakterleri :"+sb1.subSequence(7, 12));//fehan
    System.out.println("sb 'nin 5 dahil tum karakterleri :"+sb1.toString().substring(5));//efehan guzel insan
    System.out.println("sb 'nin 5 dahil tum karakterleri :"+sb1.subSequence(5, sb1.length()));//efehan guzel insan
    
    //sb dekibelli bir index 'deki karakteri silme --> obj.delete(a,b); a dahil b hariç arası siler.  obj.deleteCharAt(a); sadece a karakterini siler
    sb1.delete(3, 7);
    System.out.println("3-7 arası karakter silinmis hali : "+sb1);
    sb1.deleteCharAt(2);//sb1.delete(2,3);-->2. karakteri siler
    System.out.println("2. karakter silinmis hali : "+sb1);
    System.out.println("faruk efehan son hali : "+sb1);//fafehan guzel insan
    
    //istenen index' istenen karakteri ve karakterleri eklemek --> obj.insert(index,obj) : insert metodo parametre olarak sadece char almz obj alabilir
    sb1.insert(2, "r");
    System.out.println("2. index'e r eklenmis hali : "+sb1);
    
    sb1.insert(7, 3.14);//sb1 obj 7. indexine 3.14 value eklendi
    System.out.println(sb1);
     int []arr= {17,63,21};
     sb1.insert(9, Arrays.toString(arr));//sb1 'in 9 karakterinden itibaren arr verileri eklendi
    
    System.out.println("sb ye arr eklenmis hali : "+sb1);
    
    //istenen index deki characterin yerine birden fazla character eklemek --> obj.replace(a,b,"charakterler")
    
    StringBuilder sb2=new StringBuilder("Bugun hava cook iscakk");
    System.out.println(sb2);
    sb2.replace(3, 8, "xxxxxxxx");//3 dahil 8 haric indexler arasini silip yerine  xxxxxxxx koyduk.
    
    
    // 3 dahil 8 haric index arasina  verilen  stringi atar, 
    //ama atanacak string kısa atanacak index uzun olursa  kalan index'teki karakterleri siler
    
    
    System.out.println("sb2 son hali :"+sb2);//Bugxxxxxxxxva cook iscakk
    
    System.out.println("ozel durum : "+sb2.insert(5, "basarili", 2, 4));//Bugxxsaxxxxxxva cook iscakk
    /*
     * 5:sb2 ye basarili ekleme baslangic indexi 
     * basarili : eklenecek string
     * 2:eklenecek stringin baslangic indexi--> dahil
     * 4:eklenecek stringin bitis  indexi --> haric.
     */
    
    //reverse methodu--> obj.reverse(); sb elemanları indexe  gore ters cevirir. 
    StringBuilder sb3=new StringBuilder("Bugun hava cook iscakk");
    System.out.println("sb3 ilk hali : "+sb3);
    sb3.reverse();
    System.out.println("sb3 ters cevirilmis hali : "+sb3);
    
    //String ile StringBuilder karsilastirmasi: == equals -->
    //SB de eguals metodu string classından farkli calisir.String clsassindaki == operatoru ile ayni 
    //islemi yapar.. HEm icerik hemde referans aesitligine bakar.
    
    String s="hayat";
    StringBuilder sb =new StringBuilder("hayat");
    
    //System.out.println(s==sb);// --> farkli data type ları karsılastima operotoru derlemeyez CTE verir.
    
    System.out.println(s.equals(sb));//false
    
//SB toString methodu ile stringe cevirelerek string manipulation methodalri kullanilabilir .
    
    System.out.println(s.equals(sb.toString()));//true--> string-string karsilastirması equals metodu normal calistir. sadece icerige bakar
    System.out.println(sb.equals(sb.toString()));//false-->sb-string karsilastirması equals metodu normal degil == gibi calisir. sadece icerige degil icerik ve ref bakar
    //StringBuilder inedx parametreli appent: farkli string den parca ekleme --> 
    
    System.out.println(sb.toString().concat("guzel"));
    System.out.println(sb);
    System.out.println(sb.append(s));//sb ye s nin 2 ile 5 arasini appent et ekle
    

	}

}
