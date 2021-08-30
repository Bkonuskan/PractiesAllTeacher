package _12_Encapsulation.Ex2;
/* 1- filedları model(String), renk(String), motor(int), yil (int)
    olan Araba  isimli bir class tanımlayınız.
 2- bütün fieldları parametre alan bir constructor tanımlayınız.
 3- bütün fieldları için getter ve setter metodları oluşturunuz.
 4- ArabaMain isminde main için bir class oluşturunuz.
 5- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
 6- aracların motor ve yılını hatalı veri girisine karsi kapsulleyiniz.

 */
public class Araba {

    private String model;
    private  String renk;
    private int motor;
    private int yil;
    public Araba(){//parametresiz constructor atadık parametreli cons default conts ezdiği için

}
  //parametreli constructor ...sağ tık--> Generate-->Constructor...
    public Araba(String model, String renk, int motor, int yil) {

        // this.model = model;
        // this.renk = renk;
        // this.motor = motor;
        // this.yil = yil;
// this.yil = yil;-->üretilen obj nin yıl değeri buradan alırsa sete girmeden düzenlenmeden alınır
        // this.beygir = beygir;
        //cons obj parametrelerini hatalı üretmesin diye field yani dğerleri encapsule ederek get set metodlarında gönderilmeli
        // yoksa yıl volvoda hatalı -2020 girilir
        setModel(model);
        setRenk(renk);
        setMotor(motor);//üretilen obj nin beygir değeri set metodundan almalı
        setYil(yil);//üretilen obj nin yıl değeri set metodundan almalı.yol verisi setYil metoduna parametre yapılark
        // bu verinim setYil metodu tarafından işlenmesi sağlandı
    }
    //getter setter methodları...sağ tık--> Generate-->Getter and Setter...

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil>0) {
            this.yil = yil;
        }else
            System.out.println("yılı negatif  olamaz...");

    }
}
