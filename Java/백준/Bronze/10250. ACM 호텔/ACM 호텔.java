import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        int T;
        int H, W, N;
        int floor, room;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int n = 0; n < T; n++){
            H = sc.nextInt();
            W = sc.nextInt();
            N = sc.nextInt();

            floor = (N % H == 0) ? H : N % H;
            room = (N % H == 0) ? N / H : N / H + 1;

            System.out.printf("%d%02d\n", floor, room);
        }
    }
}
