import java.util.Scanner;

public class  {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int K = scan.nextInt();

        //행렬 생성
        int[][] A = new int[N][M];
        int[][] B = new int[M][K];
        int[][] C = new int[N][K];

        //곱셈 과정
        for(int i = 0; i<N; i++){
            for(int j = 0; j<K; j++){
                for(int k = 0; k<M; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

    }
}
