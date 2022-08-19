mport java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class b11866 {
    public static void Main(String[] args) {
        
        int N,K;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt(); //인원
        K = scan.nextInt(); //순서

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i<=N; i++){
            q.add(i);
        }

        System.out.print("<");

        while(!q.isEmpty()){
            for(int i = 0; i<K-1; i++){
                q.add(q.poll());
            }
            System.out.print(q.poll());

            if(!q.isEmpty()){
                System.out.print(", ");
            }

        }

        System.out.print(">");
    }
}
