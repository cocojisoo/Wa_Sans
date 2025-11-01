import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String vocabulary = br.readLine();

        char[] alphabet = parseString(vocabulary);    
        int length = alphabet.length;

        printResult(alphabet, length);
    }

    static char[] parseString(String s) {
        return s.toCharArray();
    }

    static void printResult(char[] str, int length) {
        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = length - 1; i >= 0; i--) {
            int idx = str[i] - 'a';
            if (0 <= idx && idx < 26) {
                arr[idx] = i; 
            }
        }
        for(int i = 0; i < 26; i ++){
          System.out.print(arr[i]+" ");
        }
    }
}
