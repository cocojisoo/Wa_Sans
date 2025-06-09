import java.io.*;
import java.util.*;

class Main {
  public static int difficulty(int[] vote, int n){
    if(n == 0) return 0;
    int delete;
    double length = n * 0.15;
    Arrays.sort(vote);
    if(length % 1 >= 0.5){
      delete = (int)length + 1;
    }
    else delete = (int)length;
    double avg = 0;
    for(int i = delete ; i < n - delete; i++){
      avg += vote[i];
    }
    avg /= (n - 2*delete);
    return (int)(avg + 0.5);
  }
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] vote = new int[n];
    for(int i = 0; i < n ; i++){
      vote[i] = Integer.parseInt(br.readLine());
    }
    
    System.out.println(difficulty(vote,n));
    
  }
}