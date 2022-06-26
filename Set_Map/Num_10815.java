package Set_Map;

import java.util.Arrays;
import java.util.Scanner;

public class Num_10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sang[] = new int[N];
        for(int i = 0; i<sang.length; i++){
            sang[i] = sc.nextInt();
        }
        Arrays.sort(sang);

        int M = sc.nextInt();
        int num[] = new int[M];
        for(int i = 0; i<num.length; i++){
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (binarySearch(sang, num[i])) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }

    private static boolean binarySearch(int[] a, int n){
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid] == n){
                return true;
            }
            else if(a[mid] > n){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}
