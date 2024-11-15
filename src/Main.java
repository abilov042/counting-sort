import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder output = countingSort(input);

        System.out.println(output);

        System.out.println(output.reverse());
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