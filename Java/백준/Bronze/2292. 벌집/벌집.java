import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine().trim());

        if (N == 1) {
            System.out.println(1);
            return;
        }
        long layer = 1;     
        long end = 1;       
        long add = 6;       
        while (N > end) {
            end += add * layer; 
            layer++;
        }
        System.out.println(layer);
    }
}
