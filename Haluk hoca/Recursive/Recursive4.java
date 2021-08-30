package Recursive;

public class Recursive4 {
    public static void main(String[] args) {


    }


    /*
       her tavsanin iki kulagi vardir. siralanmis tavsanlarin toplam kulaksayisini bulunuz
        tavsanKulagi(0) → 0         tavsanKulagi(1) → 2     tavsanKulagi(2) → 4
   */
    public static int tavsanKulagi(int tavsanSayisi) {
        if (tavsanSayisi < 1) return 0;
        else return 2 + tavsanKulagi(tavsanSayisi - 1);
    }


    /*
     Sirada duran tavsanlar var :  1, 2, ...
     Tek sayili siradaki (1, 3, ..)  tavsanlarin normal olarak 2 kulagi var.
     Cift sayili siradaki (2, 4, ..)  tavsanlarin ise 3 kulagi var.
     n. inci siradaki tavsana kadar toplam kulak sayisini bulunuz

     tavsanKulagi2(0) → 0     tavsanKulagi2(1) → 2     tavsanKulagi2(2) → 5
  */
    public static int tavsanKulagi2(int tavsanSayisi) {

        while (tavsanSayisi > 0) {
            if (tavsanSayisi % 2 == 0)
                return 3 + tavsanKulagi2(tavsanSayisi - 1);
            else
                return 2 + tavsanKulagi2(tavsanSayisi - 1);
        }
        return 0;
    }

}
