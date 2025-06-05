import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int floor, room = 0;
        for(int i = 0; i < T; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            floor = (N % H) == 0 ? H : N % H;
            room = (N % H) == 0 ? N / H  : N / H + 1;
            System.out.printf("%d%02d\n",floor,room);

            
        }

    }
}