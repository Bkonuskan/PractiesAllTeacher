import java.util.Random;
import java.util.Scanner;

public class IsimOyunu {
    public static void main(String[] args) {

        theWordGame("la belle vie");

    }
	/*
	 							The Wheel Of Fortune Game (TWOF):
	 1)You have tree lives at the beginnig of the game. If you can't find correct letter
	  You will loose a live.
	 2)The points that are likely to come from TWOF are
	  {100,200,300,400,500,600,700,800,900,1000,5000,10000,BANKRUPT,PASS};
	 3)The point you get from TWOF should be multiplied by the number of letters you find
	 4)If Bankrupt comes, you lose the game straight away.
	 5)theWordGame("la belle vie"); When we call this method, the game is installed
	  on this sentence

	 */

    static void theWordGame(String word) {

        Scanner scan = new Scanner(System.in);

        word =word.toUpperCase();
        StringBuilder unknownword = new StringBuilder(word.replaceAll("\\S", "-"));
        String live = "♥♥♥";
        boolean ifCorrect = false;
        int wof=0;
        int score = 0;

        System.out.println(live);

        while (unknownword.toString().contains("-")) {


            System.out.println("****** Your score is " + score + " ******");

            wof=wheelOfFortune();

            if (wof == 0) {
                System.out.println("The wheel of fortune is BANKRAPT");
                System.out.println("You lost!!!");
                break;
            }
            if (wof==1) {
                System.out.println("The wheel of fortune is PASS");
                live=lostLive(live);
                System.out.println(live);
                continue;

            }
            System.out.println("The wheel of fortune is " + wof);
            System.out.println(unknownword);

            System.out.println("Enter a letter...");
            char l = scan.next().toUpperCase().charAt(0);

            for (int i=0; i<word.length(); i++) {
                if(word.charAt(i)==l) {
                    unknownword.setCharAt(i, l);
                    ifCorrect=true;
                    score = score + wof;
                }
            }

            if(ifCorrect==false) {
                live=lostLive(live);
                if (live.length()==0) {
                    System.out.println("You lost!!!");
                    break;
                }
                System.out.println(live);
            }

            ifCorrect=false;
        }
        if (!unknownword.toString().contains("-")) {
            System.out.println(unknownword);
            System.out.println("Congrulations, you did it, your score is "+ score );
        }
        scan.close();
    }

    public static int wheelOfFortune() {
        Random rdm = new Random();
        int [] wof = {100,200,300,400,500,600,700,800,900,1000,5000,10000,0,1};
        int idx = rdm.nextInt(14);
        return wof[idx];
    }

    public static String lostLive(String s) {
        StringBuilder live= new StringBuilder(s);
        live.deleteCharAt(0);
        return live.toString();
    }
}
