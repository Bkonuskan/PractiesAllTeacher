package _88_Odev;

public class Ex07 {

     /*
        Write a java program to count occurrences of each character in String in java. If the String is
        "Java Hungry" then the answer should be

         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
    */
     public static void main(String[] args) {
         String str = "Javacilar cook afilli";

        int count[] = new int[256];

         for (int i = 0; i < str.length(); i++)
             count[str.charAt(i)]++;


         char ch[] = new char[str.length()];
         for (int i = 0; i < str.length(); i++) {
             ch[i] = str.charAt(i);
             int find = 0;
             for (int j = 0; j <= i; j++) {

                 // If any matches found:Herhangi bir eşleşme bulunursa
                 if (str.charAt(i) == ch[j])
                     find++;
             }

             if (find == 1)
                 System.out.println(
                         str.charAt(i)
                                 + " = " + count[str.charAt(i)]);
         }

     }
}
