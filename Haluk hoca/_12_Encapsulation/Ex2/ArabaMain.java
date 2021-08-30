package _12_Encapsulation.Ex2;

public class ArabaMain {
    public static void main(String[] args) {

        Araba honda = new Araba();//Araba classından honda obj ürettik.parametresiz cons ile ...
        // honda.model="accord";  ..private yapınca obj üzerinden direk ulaşılamaz
      //  honda.renk="beyaz";
        //honda.motor=2000;
        //honda.yil=2016;

        honda.setModel("accord"); //honda obj değerleri set methodu ile atadık
        honda.setRenk("beyaz");
        honda.setMotor(2000);
        honda.setYil(2016);
        Araba toyota =new Araba("corolla","gri",1600,2020);//toyota obj parametreli cons ürettik
        Araba volvo =new Araba("s80","mavi",1600,-2020);//volvo obj parametreli cons ürettik
        System.out.println("volvo.getYil() = " + volvo.getYil());
    }
}