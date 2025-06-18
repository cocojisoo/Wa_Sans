import java.io.*;
import java.util.*;


class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    switch(n / 10){
      case 10 : 
      case 9:
        System.out.print("A");
        break;
      case 8:
        System.out.print("B");
        break;
      case 7:
        System.out.print("C");
        break;
      case 6:
        System.out.print("D");
        break;
      default:
        System.out.print("F");
        break;
      
    }
    
    
  }
}