package Number_Combination;

import java.util.*;

public class Num_9375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
            int n = sc.nextInt();
            Map<String, String> map1 = new HashMap<>();
            Map<String, Integer> map2 = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map1.put(sc.next(), sc.next());
            }

            for (String key : map1.keySet()) {
                int count = 1;
                if (map2.containsKey(map1.get(key))) {
                    map2.put(map1.get(key),map2.get(map1.get(key))+1);
                }else{
                    map2.put(map1.get(key), count);
                }

            }
            double ret = 1;
            for (String key : map2.keySet()) {
                ret = ret * (map2.get(key)+1);
            }
            System.out.printf("%.0f\n", ret-1);
            T--;
        }
    }
}
