import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        s = s.trim();
        if (s.isEmpty()) { 
            System.out.print(0);
            return;
        }

        StringTokenizer st = new StringTokenizer(s, " ");
        System.out.print(st.countTokens());
    }
}
