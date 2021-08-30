package _14_Override._01;

public class Dog extends Animal {
	
	@Override //Annotation -->mutlaka childe yazilir parent ve child metodlarında iliski kurar
	public  void beslenme() {
		System.out.println("kemik ile beslenir");
	}

	@Override
	public void tatli() {
		System.out.println("fistik sarma");
	}

	@Override
	protected String icecek() {
		System.out.println("tursu suyu");
		return "yarasin";
	}

	@Override
	public Integer  topla() {
		return 41+54;
		
	}

	@Override
	public Dog fatih() {
		
		return new Dog();
	}

	

}
