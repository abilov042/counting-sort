import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        StringBuilder output = countingSort(input);
//
//        System.out.println(output);
//
//        System.out.println(output.reverse());

        int[] arr = new int[]{9, 2, 4, 1, 1, 5};

        System.out.println(Arrays.toString(countingSortV2(arr)));


    }

    public static int[] countingSortV2(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int[] t = new int[max + 1];
        // kjhg
        for (int i = 0; i < arr.length; i++) {
            t[arr[i]]++;
        }
        System.out.println(Arrays.toString(t));

        for(int i = 1; i < t.length; i++) {
            t[i] = t[i] + t[i - 1];
        }

        System.out.println(Arrays.toString(t));

        int[] newArr = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[t[arr[i]] - 1] = arr[i];
            t[arr[i]]--;
        }

        return newArr;
    }

    public static StringBuilder countingSort(String s) {


        int[] t = new int[26];
        // kjhg
        for (int i = 0; i < s.length(); i++) {
            t[s.charAt(i) - 97]++;
        }

        StringBuilder st = new StringBuilder();
        for(int i = 0; i < t.length; i++) {
            while (t[i] > 0){
                st.append((char) (i + 97));
                t[i]--;
            }
        }

        return st;
    }
}