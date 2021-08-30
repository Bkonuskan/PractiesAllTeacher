package _14_Override.OverridePractice.AracPark;

public class Otobus extends Arac {
    int yolcuSayisi;

    public Otobus(String renk, int motor, String model, int yolcuSayisi) {
        super(renk, motor, model);
        this.yolcuSayisi = yolcuSayisi;
    }




    @Override
    public String toString() {
        return "Otobus{" +
                "renk='" + getRenk() + '\'' +//renk değişkeni private oldğ için direk erişilemez
                ", motor=" + getMotor() +//motor değişkeni private oldğ için direk erişilemez
                ", model='" + model + '\'' +//model değişkeni protected oldğ için direk erişilir
                "yolcuSayisi=" + yolcuSayisi +
                '}';
    }







}
