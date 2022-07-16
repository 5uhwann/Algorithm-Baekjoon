package BackTracking;

import java.util.Scanner;

public class Num_15652 {
    static int N,M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        dfs(0, 0);
        System.out.println(sb);
    }

    public static void dfs(int a, int b) {
        if (a == M) {
            for (int num : arr) {
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = b; i < N; i++) {
            arr[a] = i+1;
            dfs(a+1, i);
        }
    }
}
