package Set_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Num_10816 {
    static Map<String,Integer> n;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();

        n = new HashMap<>();
        for(int i=0; i<N; i++){
            String a = sc.next();
            if(!(n.containsKey(a))){
                n.put(a,1);
            }
            else{
                n.put(a,n.get(a)+1);
            }
        }

        int M = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<M; i++){
           sb.append(check(sc.next())+" ");
        }
        System.out.println(sb);
    }

    public static int check(String a){
        if(n.containsKey(a)){
            return n.get(a);
        }
        return 0;
    }
}
