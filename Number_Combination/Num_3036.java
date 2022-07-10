package Number_Combination;

import java.util.Scanner;

public class Num_3036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        int N = sc.nextInt();

        int array[] = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 1; i < array.length; i++) {
            int gcd = gcd(array[0], array[i]);
            System.out.println(array[0]/gcd + "/" + array[i]/gcd);
        }
    }

    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int c = a%b;
            a = b;
            b = c;
        }
        return b;
    }

}
