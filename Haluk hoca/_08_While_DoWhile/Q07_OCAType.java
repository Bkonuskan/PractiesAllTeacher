package _08_While_DoWhile;

public class Q07_OCAType {
    public static void main(String[] args) {
/*
aşağıdaki kod bloğunun çıktısı ne olur?
 */
        int x = 3;
        int y = 0;
        while (y < 3) {
            x += 1;  //x = x + 1
            y += 1;
        }
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }


// A) x = 3
//    y = 0

// B) x = 6  ****
//    y = 3

// C) x = 9
//    y = 0

}
