package Number_Combination;

import java.util.Scanner;

public class Num_1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            double wSite = sc.nextDouble();
            double eSite = sc.nextDouble();

            System.out.printf("%.0f\n", combination(eSite,wSite));
        }

    }
    public static double combination(double n, double r) {
        double a = 1;
        double b = 1;
        for (double i = n; i > n-r; i--) {
            a = a*i;
        }

        for (double i = r; i >0 ; i--) {
            b = b*i;
        }
        return a/b;
    }
}
