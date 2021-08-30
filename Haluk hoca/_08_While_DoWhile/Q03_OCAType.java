package _08_While_DoWhile;

public class Q03_OCAType {
    public static void main(String[] args) {
        //DEBUG
        int num = 10;
        do {// post=print 10 first then decrease
            System.out.print(num-- + " " + num);
        } while (num == 0);
        /*
         * // What is the result?
         * A) 9876543210
         * B) 9
         * C) 421
         * D) 9 10
         * E) Nothing is printed
         * F) 10 9 ***
         */
    }



}
