package _12_Encapsulation.Ex6;

public class BMI {
    /*
      1 ) BMI ve MainBMI class'ları creat ediniz
      2 ) BMI class'ı için field'ları name(String), age(int), weight(double) ve height(double) olan veriable'lar oluşturup tüm veriableleri encapsule ediniz.
      3 ) tüm  field'ları setter getter ve  constructor creat ediniz.
      4 ) bmi=weight/(height*height) formulüne göre bmi hesaplayan bir method creat ediniz.
      5 ) bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez durumunu veren method creat ediniz.
)     6 ) MainBMI de  bu değereli yazdırınız.
        */
    //name, age, weight,height
    private String name;
    private int age;
    private double weight;
    private double height; //1.60

//bmi=weight/(height*height) getBMI()
//bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez getStatus()


    public BMI(String name, int age, double weight, double height) {
        setAge(age);
        setHeight(height);
        setName(name);
        setWeight(weight);
    }

    public double bmiHesapla() {
        double bmi = weight / (height * height);
        return Math.round(bmi);
    }

    public String durum() {

        double bmi = bmiHesapla();

        if (bmi < 18.5)
            return "zayif";

        else if (bmi < 25)
            return "normal";

        else if (bmi < 30)
            return "kilolu";

        else
            return "obez";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
