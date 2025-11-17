import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        Map<Integer, Integer> freq = new HashMap<>();
        long sum = 0;

        for (int i = 0; i < N; i++) {
            int v = Integer.parseInt(br.readLine());
            arr[i] = v;
            sum += v;
            freq.put(v, freq.getOrDefault(v, 0) + 1);
        }

        int mean = (int) Math.round(sum / (double) N);
        Arrays.sort(arr);
        int mid = arr[N / 2];
        int maxFreq = 0;
        for (int f : freq.values()) {
            if (f > maxFreq) {
                maxFreq = f;
            }
        }
        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() == maxFreq) {
                modes.add(e.getKey());
            }
        }
        Collections.sort(modes);
        int mode;
        if (modes.size() == 1) {
            mode = modes.get(0);
        } else {
            mode = modes.get(1);
        }
        int range = arr[N - 1] - arr[0];

        System.out.println(mean);
        System.out.println(mid);
        System.out.println(mode);
        System.out.println(range);
    }
}
