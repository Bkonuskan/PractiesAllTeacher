package Recursive;

public class Recursive3 {
    public static void main(String[] args) {


        System.out.println(toplam(5));


    }

    /*
        0! = 1,     1! = 1,     2! = 2*1,   3! = 3*2*1,     6! = 6*5*4*3*2*1
    */
    public static int factorial(int n) {
        if (n == 1) return 1;
        else return n * factorial(n - 1);
    }

    public static int toplam(int n) {
        System.out.println(n + " : " + n * n);
        if (n == 1) return 1;
        else return (int) Math.pow(n, 3) + toplam(n - 1);
        // n*n (n-1)*(n-1) + (n-2)*(n-2) + ..... 1*1
    }


    /*
        fib(0)=0,   fib(1) = 1,     fib(2) = fib(1) + fib(0), ....,   fib(n) = fib(n-2) + fib(n-1)
        Fibonacci Serisi: 0, 1, 1, 2, 3, 5, 8, 13, 21 ....
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


    /*
        bir yazi

     */


}

