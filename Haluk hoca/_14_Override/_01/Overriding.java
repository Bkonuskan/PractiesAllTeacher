package _14_Override._01;

public class Overriding {
	
	/*Overriding::::
	 * Parent class'daki bir METHOD'u child class'a gore ozellestirerek kulanmanin adidir.
	 * OVERRIDING KURALLARI
	 * 1) Overriding creat edilirken  "method signature" (name+ parameters)
     * 	kesinlikle ve ASLAAA degistirilemez...!!!	
     * 
	 * 2)Overriding creat edilirken "access modifier" belirli kurallara gore degistirilebilir
	 * 
	 * 3)Overriding creat edilirken "return type" belirli kurallara gore degistirilebilir
	 * 
	 * 4)Overriding creat edilirken "method body" %99   degistirilir.
	 *    ama degistirilmezse  CTE vermez (amelelik olur overriding amaci body creat etmek .)
	 *  
	 * 5)Overriding creat edilirken "parent - child" relationship sarttir.
	 *    Ahan da trick :  inheritance olamadan overriding olamz  OLAMAZZZZ...!
	 * 
	 * 6)"Overridden method": Parent class'daki methoddur(zavallı ezilen)
	 *   "Overriding method": Child class'daki methoddur( ezen)
	 * 
	 * 7) "Overriding method" (child )'ın AccMo ya "Overridden method" (parent) ile ayni ya da 
	 * daha genis olmali .Evlat babanin erisimini daraltamaz ama genisletebilir. SubAccMod >= SuperAccMod
	 * 
	 * 8)"Overriding method" (child )'ın return type void ise "Overridden method" (parent) return type void olmali 
	 * kendinden olmayani kanul etmez
	 * 
	 * 9)"Overriding method" (child )'ın return type Wrapper clas'dan ise "Overridden method" (parent) return type Wrapper clas'dan
	 *  olmali kendinden olmayani kabul etmez
	 *  
	 *  10) "Overriding method" (child )'ın return type ile "Overridden method" (parent) return  arasinda is-A (child-->parent relationship)
	 *  iliskisi olmali
	 *  
	 *  11)Static method'lar overriding edilemezlerrrr.
	 *  12)Private  method'lar overriding edilemezlerrrr. -->neden : cunku private
	 *  13)Final  method'lar overriding edilemezlerrrr. -->neden : final: son hali artik degistirelemezzz de ondan.
	 *  
	 *  14)"Polymorphism" BUZZZ gibi inteview....-->"overloading" ve "overriding" den olusan yapiya denir.
	 *  
	 *  		"overloading"---> public void yemek(){...}
	 *  						  public void yemek(String tatli){...}
	 *  						  public void yemek(String tatli , int ucret){...}
	 *  
	 *  
	 *  
	 *  		"overidding"--->  public void icmek(){syso(gazoz)}
	 *  						  public void icmek(){syso(dark ve sek bir kahve)}
	 *  						  public void icmek(){syso(ucret)}
	 *  
	 *  
	 *  		"overloading" ile  "overriding" arasindaki farklar :
	 *  	1) "overloading" de  method signature(name+parametre)  değistirilir  (paarametre degisir)
	 *         "overriding" de  method signature(name+parametre)  asla degistirilemez
	 *         
	 *      2)"overloading" de inheritance gerekmez 
	 *         "overriding" de inheritance olmadam overriding yapilamaz
	 *         
	 *      3)"overloading" de body genelliklle degistirlmeden kullanilir 
	 *         "overriding" de body hemen  hemen her zaman  degistirilir
	 *         
	 *      4)Static method'lar overriding edilemezlerrrr. ama overloading edilebilirler
	 *        Private  method'lar overriding edilemezlerrrr. ama overloading edilebilirler
	 *        
	 *      5)overloading Compile Time Polymorphism'dir -->static
	 *      overriding    Run Time Polymorphism'dir -->dinamik
	 *  
	 *  
	 *  
	 * 
	 * 
	 * 
	 * 
	 */

}
