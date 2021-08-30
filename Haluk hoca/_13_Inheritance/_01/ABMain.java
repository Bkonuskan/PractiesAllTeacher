package _13_Inheritance._01;

public class ABMain {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("a oluşturduğunda = " + A.mesaj);

        B b = new B();
        System.out.println("b oluşturduğunda = " + B.mesaj);

        System.out.println("b den sonra a nın durumu = " + A.mesaj);
        /*  Static değişkenkerin olduğu classlardan oluşturulan subclasslardan
        static değişkenin değeri değiştirildiğinde süper classdaki değer de değişir.
         Çünkü static değişkenler hafızada tek bir değer gösterir. */
    }
}
