package _12_Encapsulation.Ex1;

public class AdemOglu {
    //instace veriable class levelde craete edilir. property field attribute de denir
    String adı;
    String soyadı;
    private int yas;//yas verisini isteidğim şartlarda kullanması için private yaparak koruma altına aldım ve kullanım şartlarını ben vereiyorum.

    //private değişkene ulaşmak için method yazılmalı
    //setter method : veriable daki veriyi update eder değiştirir.bu metod parametreli olmalı
    public void setYas(int yas) {//setter method : veriable daki veriyi update eder değiştirir.bu metod parametreli olmalı
        if (yas>0) {//- değer girme kontrolu yapıldı.
        this.yas = yas;//parametre olarak girilen yas değerini instance veriable yasa ata
            System.out.println("vaaay hic de gostermiyon aga....gayet basarili :) ");

        }else    this.yas=-yas;

       // 2. yol this.yas=Math.abs(yas); yası math clasından mutlak değer nmetoduna attık

    }

    //getter Method : veriable daki veriyi getirir.bu method parametresiz olmalı
    public int getYas(){
        return this.yas;
    }
}





