package _09_Arrays;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {


        //multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
        // ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
        //input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}


        int arr[][]={{10,20,30},{4},{6,7,20}};
        int sonuc[]=new int [arr.length];
        for (int kat = 0; kat < arr.length ; kat++) {
            for (int daire = 0; daire <arr[kat].length ; daire++) {
                sonuc[kat]+=arr[kat][daire];
            }
        }
        System.out.println(Arrays.toString(sonuc));
    }}
