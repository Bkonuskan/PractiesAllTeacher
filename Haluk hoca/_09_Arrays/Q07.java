package _09_Arrays;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * write a method that accepts a 2 dimensional array and finds the max value
		 * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
		 * Input : {{1,2,3},{4,5},{6,7,8}} 
		 * Output : 8 
		 */
	
		int arr [][]= {{1,2,-3},{41,5},{6,7,18}};
		/*
		 * 1,2,-3 -> 0. kat
		 * 41,5   -> 1. kat
		 * 6,7,18 -> 2. kat
		 * 
		 */
	
		System.out.println("iki katli array in max elemani : " + maxdegeribul(arr)); //8

	
	}

	public static int maxdegeribul(int[][] arr) {
	int max =arr [0][0];
	
	for (int kat = 0; kat < arr.length; kat++) {//kat kontrolu
		for (int daire= 0; daire < arr[kat].length; daire++) {//daire kontrolu
			if (arr [kat][daire]> max) {
				max =arr [kat][daire];
			}
		}
	}
		return max;
	}

}
