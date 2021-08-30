package _08_While_DoWhile;

public class Q13_OCAType {

    /*
aşağıdaki kod bloğunun çıktısı ne olur?
 */
    public static void main(String[] args) {

        int i = 3;
        while (i < 6) {
           //  i += 1; //4 5 6

            System.out.println(i);
           i += 1;
        }
    }
}

// A) 4
//    5
//    6


// B) 3 ****
//    4
//    5

// C) 4
//    6

// D) 3
//    4
//    5
//    6