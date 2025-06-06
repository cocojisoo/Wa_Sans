import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] deck = new int[N * 2];  

        int front = 0;
        int rear = N;

       
        for (int i = 0; i < N; i++) {
            deck[i] = i + 1;
        }

       
        while (rear - front > 1) {
            front++;  
            deck[rear++] = deck[front++];  
        }

   
        System.out.println(deck[front]);
    }
}