//수 정렬하기 2

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        int N;

        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        N = scan.nextInt();

        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);

        for(int i = 0; i<N; i++){
            sb.append(arr[i]+"\n");
        }
        System.out.println(sb);
    }
}
