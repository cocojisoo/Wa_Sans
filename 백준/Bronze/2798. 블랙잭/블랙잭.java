import java.util.*;





class Main {
  public static int BlackJack(int[] deck, int N, int M){
    int MAX = 0;
    int Sum = 0;
    for(int i = 0; i < N-2 ; i++){
        for(int j = i + 1; j < N -1; j++){
            for(int k = j + 1 ; k < N ; k++){
                Sum = deck[i] + deck[j] + deck[k];
                if(Sum > MAX && Sum <= M){
                    MAX = Sum;
                }
                
                
            }
        }
    }
    return MAX;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] deck = new int[100];
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i = 0; i < N ; i++){
            deck[i] = sc.nextInt();
        }
        System.out.println(BlackJack(deck,N,M));
        
    }
}