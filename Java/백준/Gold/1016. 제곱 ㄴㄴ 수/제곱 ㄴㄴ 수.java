import java.io.*;
import java.util.*;

class Main {
   public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long min = Long.parseLong(st.nextToken());
    long max = Long.parseLong(st.nextToken());
    boolean[] sqrenono = new boolean[(int)(max-min+1)];
    for(long i = 2; i * i <= max; i++){
        long sqre = i * i;
        for(long k = ((min+sqre-1)/sqre); sqre * k <=max ; k++){
            sqrenono[(int)(k*sqre-min)] = true;
        }
    }
    
    int count = 0;
    for(int i = 0; i < sqrenono.length; i++){
        if(!sqrenono[i]) count++; 
    }
    
    System.out.println(count);
    
        
   }

    
}