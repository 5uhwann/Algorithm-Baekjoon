package BackTracking;

import java.util.Scanner;

public class Num_15650 {
    public static int N,M;
    public static int[] arr;
    public static boolean[] isVisit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[M];
        isVisit = new boolean[N];
        dfs(0, 0);
    }

    public static void dfs(int a, int b) {
        if (a == M) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }


        for (int i = b; i < N; i++) {
            if (!(isVisit[i])) {
                isVisit[i] = true;
                arr[a] = i + 1;
                dfs(a + 1, i);
                isVisit[i] = false;
            }
        }
    }
}

