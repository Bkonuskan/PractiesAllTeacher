import java.util.ArrayList;

public class RomaRakamlari2 {
    public static void main(String[] args) {

        System.out.println(romanNumbers(874));
        System.out.println(fromRomans("LXXIV"));

        int n1 = Integer.parseInt("123");
        System.out.println(n1+1);

    }

    static String romanNumbers(int a) {
        String ones [] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens [] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hundreds [] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        ArrayList<Integer> list = new ArrayList<>();
        int n = 0;
        String s="";

        while (a>0) {
            n= a%10;
            list.add(n);
            a=a/10;
        }

        if (list.size()==3) {
            s=hundreds[list.get(2)]+tens[list.get(1)]+ones[list.get(0)];
        } else if (list.size()==2) {
            s=tens[list.get(1)]+ones[list.get(0)];
        } else if (list.size()==1) {
            s=ones[list.get(0)];
        }

        return s;

    }

    static int fromRomans(String s) {
        int h=0;
        int t=0;
        int o=0;
        String f="";

        String ones [] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens [] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hundreds [] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};

        for (int i=0; i<10; i++) {
            if (i==5 && h==4) {
                continue;
            }
            if (s.startsWith(hundreds[i])) {
                h=i;
                f=hundreds[i];
            }
        }
        s=s.replaceFirst(f, "");

        for (int i=0; i<10; i++) {
            if (i==5 && o==4) {
                continue;
            }
            if (s.endsWith(ones[i])) {
                o=i;
                f=ones[i];
            }
        }
        s=s.replaceFirst(f, "");

        for (int i=0; i<10; i++) {
            if (i==5 && t==4) {
                continue;
            }
            if (s.contains(tens[i])) {
                t=i;
                f=tens[i];
            }
        }
        s=s.replaceFirst(f, "");

        return h*100+t*10+o;
    }
}
