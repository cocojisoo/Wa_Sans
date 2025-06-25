import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] list = new int[n];
        double sum = 0;
        for(int i = 0; i < n; i++){
            list[i] = (Integer.parseInt(st.nextToken()));
            sum += list[i];
        }
        Arrays.sort(list);
        sum = ((sum / list[n-1]) * 100) / n;
        System.out.print(sum);


    }
}