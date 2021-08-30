package _12_Encapsulation.Ex6;

public class MainBMI {

    public static void main(String[] args) {

        BMI bm1 = new BMI("Alice", 18, 80, 1.60);

        System.out.println("BMI:" + bm1.getName() + " " + bm1.durum() + " " + bm1.bmiHesapla());
    }
}
