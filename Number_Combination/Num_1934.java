package Number_Combination;

import java.util.Scanner;

public class Num_1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int a = A;
            int b = B;
            if(A<B){
                int c;
                c = B;
                B = A;
                A = c;
            }
            while(A%B != 0){
                int C;
                C = A%B;
                A = B;
                B = C;
            }
            System.out.println(a*b/B);
            T--;
        }
    }
}
