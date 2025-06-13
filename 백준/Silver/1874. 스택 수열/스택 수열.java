import java.io.*;
import java.util.*;

class Main {
    public static void NaniGosu(ArrayList<Integer> list, int n) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 1;
        boolean isPossible = true;

        for (int i = 0; i < n; i++) {
            int target = list.get(i);

            while (num <= target) {
                stack.push(num++);
                sb.append("+\n");
            }
            
            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.print(sb.toString());
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        NaniGosu(list, n);
    }
}
