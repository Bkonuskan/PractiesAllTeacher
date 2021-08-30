package _12_Encapsulation._01_encapsulation;

public class E02 {

	public static void main(String[] args) {
		
		E01 obj1 = new E01();
		System.out.println(obj1.getAge()); //25
		
		System.out.println(obj1.getName()); // Ali
		
		obj1.setAge(33);
		System.out.println(obj1.getAge()); // 33

		obj1.setName("Ayse");
		System.out.println(obj1.getName()); // Ayse
		
		//num'i 38 yap ve ekrana yazdir
		E03 obj3 = new E03();
		obj3.setNum(38);
		System.out.println(obj3.getNum());
		
		//name'i ekrana yazdirin
		System.out.println(obj3.getName());
		
	}
	

}
