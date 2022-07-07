package Number_Combination;

import java.util.Scanner;

public class Num_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        if(a>b){
            c = b;
        }
        int common_measure = 0;
        int common_multiple = 0;
        for (int i = 1; i <= c; i++) {
            if(a%i == 0 && b%i ==0){
                common_measure = i;
            }
        }
        common_multiple = a*b/common_measure;
        System.out.println(common_measure);
        System.out.println(common_multiple);
    }
}
