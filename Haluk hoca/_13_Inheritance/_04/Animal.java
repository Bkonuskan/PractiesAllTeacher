package _13_Inheritance._04;

public class Animal {
	
	public void mA() {
		System.out.println("Animal");
	}
	
	public void mM() {
		System.out.println("Mammal " + " Animal");
	}

		public int a;
		public int m = 3;
		
		public Animal() {
			
			System.out.println("Parametresiz Animal");
		}
		public Animal(int i ) {
			System.out.println("Parametreli Animal");
		}
}
