package _14_Override.OverridePractice.AracPark;

public class Arac {
    // 1- Arac isimli bir superclass olusturunuz, fields : renk, motor(private), model(protected) olsun.
    // 2- Consructor ekleyiniz.get ve set metodları ve toString Metodunu ekleyiniz.
    // 3- Bu sınıftan  Otobus sınıfını üretiniz, otobusun ayrıca yolcuSayisi field ını ekleyiniz.
    // 4- Bir AracPark isimli içinde main olan bir sınıf olusturunuz ve Otobus ten
    //    obj oluşturarak, Otobusun özelliklerinin tümünü ekrana yazdırınız.
    private String renk;
    private int motor;
    protected String model;

    public Arac(String renk, int motor, String model) {
        setRenk(renk);
        setMotor(motor);
        setModel(model);
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    //aynı classdan get yapmadan private aldık
  /*  @Override
   public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motor=" + motor +
                ", model='" + model + '\'' +
                '}';
    }


   */

}
