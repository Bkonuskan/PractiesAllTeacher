package _13_Inheritance._02;

public class SubClass extends SuperClass {
	

	    int num = 10;

	    public static void goster() {

	        System.out.println("Bu method Sub classın görüntülenme methodudur.");
	    }


	    public void my_method() {

	    	SubClass sb = new SubClass();

	    	SubClass.goster();

	    	SuperClass.goster();

	        System.out.println("Sub classtaki eleman :  " + sb.num);

	        System.out.println("süperClasstaki eleman :   " + super.num);
	    }

	    public static void main(String[] args) {

	    	SubClass sb = new SubClass();

	        sb.my_method();


	    }

}
