package Recursive;

public class Recursive2 {
    public static void main(String[] args) {

        int a = 5;

        int c = 10 + a;
        int b = 2 + recursiveMethod5(10);
        System.out.println(recursiveMethod5(50));
        System.out.println(recursiveMethod4(1000));
    }


    public static int recursiveMethod5(int n) {
        if (n == 1 || n > 100) return 1;
        else return n + recursiveMethod5(n - 1);
    }

    public static int normalMethod(int n) {
        return n + 1;
    }


    public static int recursiveMethod1(int n) {
        System.out.println(n);
        return recursiveMethod1(n++);
    }


    public static int recursiveMethod2(int n) {
        System.out.println(n++);
        return recursiveMethod2(n);
    }

    public static int recursiveMethod3(int n) {
        System.out.println(n);
        return recursiveMethod3(n + 1);
    }


    public static int normalMethod4(int n) {
        int toplam = 0;
        for (int i = n; i > 0; i--) {
            System.out.print(i + " + ");
            toplam += i;
        }
        return toplam;
    }


    public static int recursiveMethod4(int n) {
        System.out.print(n + " + ");
        // 10 + 9
        // 19
        if (n == 1) return 1;
        else return n + recursiveMethod4(n - 1);
    }


}
