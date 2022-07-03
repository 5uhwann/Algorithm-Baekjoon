package Set_Map;

import java.util.HashSet;
import java.util.Scanner;

public class Num_1269 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        HashSet<Integer> A = new HashSet<>();
        for (int i = 0; i<N; i++){
            A.add(sc.nextInt());
        }
        HashSet<Integer> B = new HashSet<>();
        for (int i = 0; i < M; i++) {
            B.add(sc.nextInt());
        }

        int count = 0;
        for(int a : A){
            if(!B.contains(a)){
                count++;
            }
        }
        for(int a : B){
            if(!A.contains(a)){
                count++;
            }
        }
        System.out.print(count);
    }
}
