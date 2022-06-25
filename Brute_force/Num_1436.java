package Brute_force;


import java.util.Scanner;

public class Num_1436 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int end_Num = 666;

        int count = 1;

        while(count != N){
            end_Num++;
            if(Integer.toString(end_Num).contains("666")){
                count++;
            }
        }
        System.out.println(end_Num);
    }
}
