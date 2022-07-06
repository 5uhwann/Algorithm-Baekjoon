package Number_Combination;

import java.util.Arrays;
import java.util.Scanner;

public class Num_1037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a[] = new int[N];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int output = a[0] * a[a.length-1];

        System.out.println(output);
    }
}
