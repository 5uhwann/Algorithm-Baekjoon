package Set_Map;

import java.util.HashSet;
import java.util.Scanner;

public class Num_11478 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < S.length(); i++) {
            set.add(String.valueOf(S.charAt(i)));
            for (int j = i; j < S.length(); j++) {
                set.add(S.substring(i,j+1));
            }
        }
        System.out.println(set.size());
    }
}
