//소트인사이드

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int N;

        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        int[] counting = new int[10];

        while(N!=0){
            counting[N%10]++;
            N/=10;
        }

        for(int i = 9; i>=0; i--){
            while(counting[i]-- > 0){
                System.out.print(i);
            }
        }
    }
}
