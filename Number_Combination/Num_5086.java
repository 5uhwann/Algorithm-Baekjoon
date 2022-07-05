package Number_Combination;

import java.util.Scanner;

public class Num_5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first;
        int second;
        while(true){
            first = sc.nextInt();
            second = sc.nextInt();
            if(first == 0 && second ==0){
                break;
            }
            if(first > second){
                if(first%second ==0){
                    System.out.println("multiple");
                }
                else{
                    System.out.println("neither");
                }
            }
            else{
                if (second % first == 0) {
                    System.out.println("factor");
                }
                else {
                    System.out.println("neither");
                }
            }
        }
    }
}
