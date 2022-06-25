package Brute_force;

import java.util.Scanner;

public class Num_7568 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N > 1){
            int w[] = new int[N];
            int h[] = new int[N];
            int ranking[] = new int[N];

            int a = 0;


            while(N>0){
                w[a] = sc.nextInt();
                h[a] = sc.nextInt();
                ranking[a] = 1;
                a++;
                N--;
            }
            for(int i = 0; i<w.length-1; i++){
                for(int j = i+1; j<w.length; j++){
                    if(w[i] < w[j]){
                        if(h[i]<h[j]){
                            ranking[i] = ranking[i]+1;
                        }
                    }
                    if(w[i] > w[j]){
                        if(h[i] > h[j]){
                            ranking[j] = ranking[j]+1;
                        }
                    }
                }
            }
            for(int i = 0; i<ranking.length; i++){
                System.out.print(ranking[i] + " ");
            }
        }
        }

}
