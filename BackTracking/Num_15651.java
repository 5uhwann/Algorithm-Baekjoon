package BackTracking;

import java.util.Scanner;

public class Num_15651 {
    static int N, M;
    static int[] array;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        array = new int[M];
        dfs(0);
        System.out.print(sb);

    }

    public static void dfs(int a) {
        if (a == M) {
            for (int num : array) {
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            array[a] = i+1;
            dfs(a+1);
        }
    }
}
