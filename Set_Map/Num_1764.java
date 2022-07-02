package Set_Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Num_1764 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        HashSet<String> set = new HashSet<>();
        ArrayList<String> output = new ArrayList<>();

        for(int i = 0; i<N; i++){
            set.add(sc.next());
        }

        for(int i = 0; i<M; i++){
            String a = sc.next();
            if(set.contains(a)){
                output.add(a);
            }
        }
        Collections.sort(output);
        System.out.println(output.size());
        for(String b : output){
            System.out.println(b);
        }
    }
}
