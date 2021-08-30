package day160821;

public class Runner {

	public static void main(String[] args) {
		
		myMetod();
		
		 
	}
	
	public static void myMetod() {
		
		SubClass subC= new SubClass();
		System.out.println("SubClass değişken değeri :" + subC.num);
		
		subC.goster();
		
		Super superC=new Super();
		System.out.println("SuperClass değişken değeri :" + superC.num);
		superC.goster();
		
	}

}
