package Set_Map;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Num_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer,String> dogam_int = new HashMap<>();
        Map<String,Integer> dogam_string = new HashMap<>();


        for(int i = 1; i<=N; i++){
            String a = br.readLine();
            dogam_int.put(i, a);
            dogam_string.put(a, i);
        }

        for(int i = 0; i<M; i++){
            String b = br.readLine();
            if(!(isNum(b))){
                bw.write(dogam_string.get(b) + "\n");
            }
            else {
                bw.write(dogam_int.get(Integer.parseInt(b)) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isNum(String s){
        boolean rt = true;
        for(int i = 0; i<s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                rt =  false;
            }
        }
        return rt;
    }
}
