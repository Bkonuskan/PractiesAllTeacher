package _13_Inheritance._04;

public class Cat extends Mammal{

		public void mC() {
			System.out.println("Cat");
		}
		public int c = 2;
		public int d = 5;
		
		public Cat() {
			super();
				System.out.println("Parametresiz Cat");
		}
		public Cat(String s) {
				this();
				/* super.c mammal daki c yi call eder
				 		Parent Class'dan variable veya method secmek icin 
				 super keyword'unu kullanabilirsiniz.
				 */
				System.out.println(super.c);
				System.out.println("Parametreli Cat");
		}
}
	
		