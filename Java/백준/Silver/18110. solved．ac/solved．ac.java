import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println(0);
            return;
        }

        int[] vote = new int[n];
        for (int i = 0; i < n; i++) {
            vote[i] = Integer.parseInt(br.readLine());
        }

        double rawCut = n * 0.15;
        int cut = (rawCut % 1 >= 0.5) ? (int) rawCut + 1 : (int) rawCut;

        Arrays.sort(vote);

        double sum = 0;
        for (int i = cut; i < n - cut; i++) {
            sum += vote[i];
        }

        double avg = sum / (n - 2 * cut);

        System.out.println((int)(avg + 0.5));
    }
}
