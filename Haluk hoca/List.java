import java.util.ArrayList;

public class List {
    /*
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     */
    public static void main(String[] args) {
        int []arr={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        System.out.println(buNasilMethod(arr));
    }
    public static ArrayList<Integer> buNasilMethod (int[] input) {
        ArrayList<Integer> result = new ArrayList<>();
        int count= 0;
        int used =1;
        while (input.length - used >= count){
            int sum = 0;
            for (int i=0;i<=count;i++)
                sum+=input[used-1+i];
            count++;
            used += count;
            result.add(sum);
        }
        return result;
    }
}
