package _13_Inheritance._04;

public class Mammal extends Animal{

		public void mM() {
			System.out.println("Mammal");
		}
		
		public void mC() {
			System.out.println("Mammal + Cat");
		}
		
		public int m = 1;
		public int c = 4;
		
		public Mammal() {
			this('Y');
			System.out.println("Parametresiz Mammal");
		}
		public Mammal(char c) {
		super(17);
			System.out.println("Parametreli Mammal");
		}
}
