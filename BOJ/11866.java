//요세푸스 문제

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N,K;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        K = scan.nextInt();

        Queue<Integer> q = new LinkedList<>(); 

        for(int i = 1; i<=N; i++){
            q.add(i);
        }

        System.out.print("<");

        while(q.size()>0){
            for(int i = 0; i<K-1; i++){
                q.add(q.poll());
            }
            System.out.print(q.poll());

            if(q.size()>0){
                System.out.print(", ");
            }

        }

        System.out.print(">");
    }
}
