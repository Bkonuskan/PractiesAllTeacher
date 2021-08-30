package Recursive;

public class Recursive1 {
    /*
        Recursive bir methodun kendisini cagirmasidir
        bir while loop gibi belirli sartlar saglandigi surece
        methodun kendisini cagirma islemidir.

        ne icin kullanilir
        benzer islemin defalarca yapilmasi durumunda recursive kullanilir

        Recursive void
     */

    public static void main(String[] args) {

        System.out.println("Normal Method");
        normalMethod5();
        System.out.println("Recursive Method");
        recursiveMethod5(0);
    }


    public static void normalMethod() {
        String str = "Normal Method";
        System.out.println(str);
    }


    public static void recursiveMethod1() {
        String str = "_JavaStudy/Recursive";
        System.out.println(str);
        recursiveMethod1();
    }


    public static void recursiveMethod2(int n) {
        String str = "_JavaStudy/Recursive";
        System.out.println(n + " " + str);
        recursiveMethod2(n++);
    }


    public static void recursiveMethod3(int n) {
        String str = "_JavaStudy/Recursive";
        System.out.println(n++ + " " + str);
        recursiveMethod3(n);
    }


    public static void recursiveMethod4(int n) {
        String str = "_JavaStudy/Recursive";
        System.out.println(n++ + " " + str);
        if (n < 10) recursiveMethod4(n);
    }


    public static void normalMethod5() {
        String str = "_JavaStudy/Recursive";
        for (int i = 1; i <= str.length(); i++) {
            System.out.println((i) + " " + str.substring(0, i));
        }
    }

    public static void recursiveMethod5(int n) {
        String str = "_JavaStudy/Recursive";
        System.out.println(++n + " " + str.substring(0, n));
        if (n < str.length()) recursiveMethod5(n);
    }
}
