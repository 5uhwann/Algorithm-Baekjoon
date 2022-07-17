package BackTracking;

import java.util.Scanner;

public class Num_9663 {

    static int N;
    static int count = 0;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];
        nQ(0);
        System.out.println(count);
    }

    public static void nQ(int a) {
        if (a == N) {
            count++;
            return;
        }
        for (int i = 0; i < N; i++) {
            arr[a] = i;
            if (isQueen(a)) {
                nQ(a+1);
            }
        }
    }

    public static boolean isQueen(int a) {
        for (int i = 0; i < a; i++) {
            if (arr[a] == arr[i]) {
                return false;
            } else if (Math.abs(a-i) == Math.abs(arr[a] - arr[i])) {
                return false;
            }
        }
        return true;
    }

}
