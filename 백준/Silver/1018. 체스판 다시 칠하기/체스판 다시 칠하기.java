import java.io.*;
import java.util.*;

public class Main {
    public static int Repaint(int x, int y) {
        int countW = 0;
        int countB = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[x + i][y + j];
                if ((i + j) % 2 == 0) {
                    if (current != 'W') countW++;
                    if (current != 'B') countB++;
                } else {
                    if (current != 'B') countW++;
                    if (current != 'W') countB++;
                }
            }
        }
        return Math.min(countW, countB);
    }
    static char[][] board;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        board = new char[M][N];
        for (int i = 0; i < M; i++) {
            board[i] = br.readLine().toCharArray();
        }
        int min = 64;
        for (int i = 0; i <= M - 8; i++) {
            for (int j = 0; j <= N - 8; j++) {
                int count = Repaint(i, j);
                min = Math.min(min, count);
            }
        }
        System.out.println(min);
    }

}
