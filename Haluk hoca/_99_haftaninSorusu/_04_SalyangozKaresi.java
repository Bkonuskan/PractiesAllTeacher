package _99_haftaninSorusu;

import java.util.Scanner;

public class _04_SalyangozKaresi {
    /*  Problem Tanımı
            Verilen boyuttaki bir kare matrisin içerisine salyangoz (helezon) şeklinde
            ardışık sayıları yerleştiriniz.
             ip ucu: maksimum sayınız girilen sayının karesine eşittir.

             Örnek Ekran Çıktıları
            Bir sayi giriniz: 3
            1 2 3
            8 9 4
            7 6 5

            Bir SAyi giriniz : 5
            1  2  3  4  5
            16 17 18 19 6
            15 24 25 20 7
            14 23 22 21 8
            13 12 11 10 9

            Bir sayi giriniz: 4
            1 2 3 4
            12 13 14 5
            11 16 15 6
            10 9 8 7
        */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("lütfen bir sayı gir=");
        int n = read.nextInt();
        int[][] arr = new int[n][n];
        int value = 1;
        int minSutun = 0;
        int maxSutun = n - 1;
        int minSatır = 0;
        int maxSatir = n - 1;
        while (value <= n * n) {
            for (int i = minSatır; i <= maxSatir; i++) {
                arr[minSatır][i] = value;
                value++;
            }
            for (int i = minSutun + 1; i <= maxSutun; i++) {
                arr[i][maxSutun] = value;
                value++;
            }
            for (int i = maxSutun - 1; i >= minSutun; i--) {
                arr[maxSutun][i] = value;
                value++;
            }
            for (int i = maxSatir - 1; i >= minSatır + 1; i--) {
                arr[i][minSatır] = value;
                value++;
            }
            minSutun++;
            minSatır++;
            maxSutun--;
            maxSatir--;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

}


