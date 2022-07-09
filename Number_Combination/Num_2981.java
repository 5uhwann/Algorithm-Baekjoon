package Number_Combination;

import java.util.*;

public class Num_2981 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        int a = arr[1] - arr[0];

        for(int i = 2; i < N; i++) {
            a = gcd(a, arr[i] - arr[i - 1]);
        }

        for(int i = 2; i <= a; i++) {
            if(a % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
